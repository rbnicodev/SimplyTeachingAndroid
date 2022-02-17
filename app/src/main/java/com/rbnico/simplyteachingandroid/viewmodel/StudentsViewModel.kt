import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.rbnico.simplyteachingandroid.MainActivity
import com.rbnico.simplyteachingandroid.model.Student

class StudentsViewModel : AndroidViewModel(Application()) {
    var listStudents: List<Student> = listOf()


    fun getStudents(): List<Student> {
        return listStudents
    }


    fun save(student: Student){
        listStudents += student
    }

    fun delete(student: Student){}

    fun getBy(name: String, lastname: String){}

}

