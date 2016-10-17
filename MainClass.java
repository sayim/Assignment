import java.io.FileNotFoundException;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		try {
			student.setStudent(1407030,"Md ijaj", "CSE", "KUET");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		student.printstudentsdetail(student, 5, 1, 1);
	}

}
