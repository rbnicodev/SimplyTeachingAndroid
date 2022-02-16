import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rbnico.simplyteachingandroid.model.Student
import com.rbnico.simplyteachingandroid.model.StudentsProvider

class StudentsViewModel : ViewModel() {
    private val _students: List<Student> = StudentsProvider.getAll()

    fun getStudents(): List<Student> {
        return _students
    }

    fun save(student: Student){}

    fun delete(student: Student){}

    fun getBy(name: String, lastname: String){}

}

