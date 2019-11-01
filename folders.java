import java.io.File;
import java.util.Scanner;

/*
 * This program is currently a working progress.
 * Made by Daniel S Park
 * 
 * Program General idea: Program will take in user inputs(Students) about their academic courses and school
 * and create folders for the courses and semester to make it easier to manage their academic files.
 * Program Synopsis: 
 * 		1) The program will ask the student for the school name
 * 		2) The program will ask for the current semester the student is in
 * 		3) The program will then ask for how many courses the student is taking
 * 		4) The program will then take in the names of the courses the student is taking
 * 		5) The program will then ask if any of these courses have projects.
 * 				if yes) The program will ask which course have projects
 * 				if no) Continue to step 6
 * 						if yes) The program will then ask how many projects
 * 								if no) there is no other option
 * 									if yes) the program will generate that amount of project folders.
 * 		6) The program will generate the default folders for these courses.
 */


public class folders {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String course = "Courses";
		String semester = "Semester";
		String lectureSlides = "Lecture Slides";
		String miscFiles = "Misc Files";
		String examMaterials = "Exam Materials";
		String homework = "Homework";
		String projects = "Project";
		
		String schoolName;
		String schoolAlreadyExist;
		String currentSemester;
		String courseOne = "";
		String courseTwo = "";
		String courseThree = "";
		String courseFour = "";
		String courseFive = "";
		
		String listOfCourses[] = {courseOne,courseTwo,courseThree,courseFour,courseFive};
		String numbercourse[]= {"First","Second","Third","Fourth","Fifth"};
		
		int numOfCourses;
		int numOfProjectCourse;
		int numOfProjects;
		String doesHaveProject;
		
		String username = System.getProperty("user.name");
		
		File root;
		
		
		
		/*
		 * start of the program 
		 * User inputs
		 */
		
		/*
		 * possibly adding file explorer to select an existing folder for the school
		 */
		System.out.println("Hello Welcome to Efficient management of your Electronic Files for school");
		System.out.println("Do you already have a school or University folder?");
		schoolAlreadyExist = scan.next();
		if(schoolAlreadyExist.equalsIgnoreCase("Yes"))
		{
			
		}
		System.out.println("Enter the School or University you are currently Attending");
		schoolName = scan.nextLine();
		System.out.println("What is your current semester?");
		currentSemester = scan.nextLine();
		System.out.println("How many courses are you currently taking?");
		numOfCourses = scan.nextInt();
		
		for(int o = 0; o<numOfCourses;o++)
		{
			System.out.println("What is the name of the "+numbercourse[o]+" course?");
			listOfCourses[o] = scan.nextLine();
		}
		
		System.out.println("Do any of these courses have projects?");
		doesHaveProject = scan.nextLine();
		if(doesHaveProject.equalsIgnoreCase("yes"))
		{
			System.out.println("How many of your courses have projects?");
			numOfProjectCourse = scan.nextInt();
			for(int i = 0;i<numOfProjectCourse;i++)
			{
				System.out.println("How many Projects?");
				numOfProjects = scan.nextInt();
			}
			
		}
		/*
		 * this is where the directories are created
		 */
		/*
		 * root = new File();
		   root.mkdir();
		*/
		System.out.println("School: "+schoolName +" Semester: "+semester+" Courses: "+ courseOne 
				+" "+ courseTwo +" "+ courseThree +" "+ courseFour +" "+ courseFive);
	}

}
