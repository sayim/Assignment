

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * This is a class to define the necessary attributes and methods to
 * conceptualize a "Student" The spepcific tasks are:Students Details
 * Information 1. Instiate :Khulna University of Engineering and Technology
 * 
 * @author (your name) Md Ijaj Sayim
 * @version (a version number or a date) 16-10-2016
 */

	
class Student {
	File inpfile=new File("input.txt");
	Scanner myScanner;
	static int c=0;
	private int id_;
	private String name_;
	private String department_;
	private String university_;
	private double[][] gpastore_;
	//private double[][] cgpastore_;
	private String[] subjectsofcurrterm_;
	private double[] credits;
	private double[] grades_;
	//static int c = 0;
	// Declare the important attributes of a student. For example:
	// 1.Id
	// 2. Name
	// 3. Department
	// 4. University
	// 5. GPAs in various terms (Multidimensional arrays)
	// 6. subjects for Current terms
	// 7. Credits and grades of Current Terms (Multidimmentional Array)

	/**
	 * Define a constructor that initilize the default properties of the Student
	 */
	//static Scanner myScanner = new Scanner(System.in);
	//FileReader fileReader=new FileReader(inpfile);
	//Scanner myScanner=new Scanner(fileReader);

	public Student() {
		// initialise variables with defult values
		id_ = 0;
		name_ = new String();
		department_ = new String();
		university_ = new String();
		gpastore_ = new double[100][100];
		subjectsofcurrterm_ = new String[100];
		credits = new double[100];
		grades_ = new double[100];

	}
	/**
	 * Define a method to print the students details.
	 */
	public void setSubjects(int n) throws FileNotFoundException{
		System.out.println("Reached");
		//myScanner=new Scanner(inpfile);
		subjectsofcurrterm_=new String[n];
		Scanner numScanner= new Scanner(myScanner.nextLine());
		//Scanner nmScanner= new Scanner(myScanner.nextLine());
		for (int i = 0; i < subjectsofcurrterm_.length; i++) {
			//String x = new String();
			//x = myScanner.nextLine();
			subjectsofcurrterm_[i] = myScanner.nextLine();
			System.out.println(subjectsofcurrterm_[i]);
		}

	}

	public void setCredits(int n) throws FileNotFoundException{
		System.out.println("Reached");
		//myScanner=new Scanner(inpfile);
		for (int i = 0; i < n; i++) {
			//double d;
			//d = myScanner.nextDouble();
			credits[i] = myScanner.nextDouble();
		}

	}

	public void setGrades(int n) throws FileNotFoundException{
		System.out.println("Reached");
		//myScanner=new Scanner(inpfile);
		for (int i = 0; i < n; i++) {
			//double d;
			//d = myScanner.nextDouble();
			grades_[i]=myScanner.nextDouble();;
		}

	}

	public void computeGpa(int n,int x,int y) throws FileNotFoundException{
		double totalcredits = 0;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			totalcredits += credits[i];
		}
		for (int i = 0; i < n; i++) {
			sum += (credits[i] * grades_[i]);
		}
		//int c1 = 0, c2 = 0;
		gpastore_[x][y] = (sum / totalcredits);
	}
	public void setStudent(int id, String name, String department,
			String university) throws FileNotFoundException{
		myScanner=new Scanner(inpfile);
		c++;
		id_ = id;
		name_ = name;
		department_ = department;
		university_ = university;
		System.out.print("Enter your current term & How many courses in Your current term :");
		int n,i,j;
		n = myScanner.nextInt();
		System.out.println(n);
		i=myScanner.nextInt();
		System.out.println(i);
		j=myScanner.nextInt();
		System.out.println(j);
		System.out.println("Enter courses");
		setSubjects(n);
		System.out.println("Enter Credits");
		setCredits(n);
		System.out.println("Enter Grades");
		setGrades(n);
		computeGpa(n,i,j);
	}

	/**
	 * public void studentDetailsById(int Id) { //write your code here }
	 */

	/**
	 * Define a method to update information of students by ID Use as many
	 * arguments as required.
	 */
	public void updateStudentById(int id) {
		// Write your code here
	}
	public double computeCGPAByID(int x,int y,Student s) {
		double sum=0;
		for(int i=0;i<=x;i++){
			for(int j=0;j<=y;j++){
				sum+=s.computeGPAById(s.id_, s, i, j);
			}
		}
		return sum/c;
	}
	/**
	 * Define a method to compute the CGPA from the Given term GPA for a
	 * particular student. se as many arguments as required.
	 */

	/**
	 * Define a method to compute the GPA from the given Credits and Grades of
	 * all the subjects
	 */
	public double computeGPAById(int id,Student s,int i,int j) {
		if(id==s.id_){
			return s.gpastore_[i][j];
		}
		else {
			return 0.0;
		}
		// write yor code here

	}

	public void printstudentsdetail(Student s,int n,int t,int t1) {
		System.out.println(s.id_);
		System.out.println(s.name_);
		System.out.println(s.department_);
		System.out.println(s.university_);
		System.out.println("Current term is "+t+" Year "+t1+" term");
		System.out.println("Courses completed By the student in this term");
		for(int i=0;i<n;i++){
		System.out.println((i+1)+"."+s.subjectsofcurrterm_[i]);
		}
		System.out.println("GPA: "+s.computeGPAById(s.id_, s, t, t1));
		System.out.println("CGPA: "+s.computeCGPAByID(t, t1, s));
	}
	/**
	 * After performing required operations on each student, save the
	 * information to a file. Use File and PrintWriter Class. use as many
	 * arguments as required.
	 * 
	 */
/**	public void saveStudents() {
		// Write your code here
	}

	/**
	 * Create a dummy files with infromations to describe the properties of a
	 * Student object and load the data files using Java File and Scanner class.
	 * use as many arguments as required.
	 */
/**	public void loadStudents() {
		// Write your code here

	}

	/**
	 * The tasks to be carried out here: 1. Create an Arrays of students using
	 * Student Class. Initlize them and perfom all the above defined operation
	 * to evualuate your code. use as many arguments as required.
	 */
}
