import org.junit.*;
import org.cse.springtute.*;
import java.lang.Exception;

public class TestRep {
    SimpleStudentRepository repo;

    @Before
    public void setUp(){
        repo = new SimpleStudentRepository();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void testSaveStudent() throws Exception{
        Student s1 = new Student("Isuru","Jayaweera",100227l,"Veyangoda");
        repo.saveStudent(s1);
        try{
            repo.saveStudent(s1);
            Assert.fail("Exception expected");
        }
        catch(Exception e){
            System.out.println("Two students can't have same key");
        }
    }

    @Test
    public void testFindStudent() throws Exception{
        Student s2 = new Student("Lahiru","Kodikara",100473l,"Gampaha");
        repo.saveStudent(s2);
        try{
            Student found = repo.findStudent(100473);
            System.out.println("Student Found with name : "+found.getFirstName());
        }
        catch(Exception e){
            Assert.fail("No exception expected");
        }
    }

    @Test
    public void testdeleteStudent()throws Exception{
        Student s3 = new Student();

        try{
            repo.deleteStudent(s3);
            Assert.fail("Exception expected");
        }
        catch(Exception e){
            System.out.println("Student's records are deleted");
        }
    }

     @Test
    public void testupdateStudent()throws Exception{
        Student s4 = new Student();
        try{
            repo.updateStudent(s4);
            Assert.fail("Exception expected");
        }
        catch(Exception e){
            System.out.println("No such student exsists");
        }
    }



}
