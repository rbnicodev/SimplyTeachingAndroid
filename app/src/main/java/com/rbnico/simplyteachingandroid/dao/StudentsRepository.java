package com.rbnico.simplyteachingandroid.dao;

import com.mongodb.client.MongoCollection;
import com.rbnico.simplyteachingandroid.db.MongoUtility;
import com.rbnico.simplyteachingandroid.model.Note;
import com.rbnico.simplyteachingandroid.model.Student;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

    MongoCollection<Document> collection;

    private void initCollection() {
        collection = MongoUtility.getClient().getDatabase("simply-teaching").getCollection("students");
    }

    public List<Student> getAll() {
        initCollection();

        List<Student> students = new ArrayList<Student>();

        for (Document d: collection.find()) {
            students.add(toStudent(d));
        }

        return students;
    }

    private Document fromStudent(Student student) {
        List<Document> notes = new ArrayList<Document>();
        for(Note n : student.getNotes())
        {
            notes.add(fromNote(n));
        }
        return new Document()
                .append("name", student.getName())
                .append("lastName", student.getLastName())
                .append("age", student.getAge())
                .append("course", student.getCourse())
                .append("notes", notes)
                .append("photo", student.getPhoto());
    }

    private Student toStudent(Document document) {
        Student student = new Student("", "", 0, 0, new ArrayList<Note>(), "");

        student.setName(document.getString("name"));
        student.setLastName(document.getString("lastName"));
        student.setAge(document.getInteger("age"));
        student.setCourse(document.getInteger("course"));
        List<Document> listNotes = document.getList("notes", Document.class);
        for(Document d : listNotes) {
            student.getNotes().add(toNote(d));
        }

        return student;
    }

    private Note toNote(Document document) {
        Note note = new Note(0, "");

        note.setDate(document.getInteger("date"));
        note.setNote(document.getString("note"));

        return note;
    }

    private Document fromNote(Note note) {
        return new Document()
                .append("date", note.getDate())
                .append("note", note.getNote());
    }
}
