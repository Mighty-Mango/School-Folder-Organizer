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
		
		/*
		 * Const Strings
		 */
		String course = "Courses";
		String semester = "Semester";
		String lectureSlides = "Lecture Slides";
		String miscFiles = "Misc Files";
		String examMaterials = "Exam Materials";
		String homework = "Homework";
		String projects = "Project";
		String backslash ="/";
		
		/*
		 * String variables that will change based on user response
		 */
		String schoolName;
		String schoolAlreadyExist;
		String currentSemester;
		String courseOne = "";
		String courseTwo = "";
		String courseThree = "";
		String courseFour = "";
		String courseFive = "";
		
		/*
		 * Arrays to hold the course names
		 */
		String listOfCourses[] = {courseOne,courseTwo,courseThree,courseFour,courseFive};
		String numbercourse[]= {"First","Second","Third","Fourth","Fifth"};
		
		/*
		 * Other variables that will change based on user response
		 */
		int numOfCourses;
		int numOfProjectCourse;
		int numOfProjects;
		String doesHaveProject;
		
		/*
		 * this will get the user name for the computer
		 */
		String userName = System.getProperty("user.name");
		String path = "";
		/*
		 * create the path for the directories
		 */
		path += "C:"+ File.separator+"Users"+ File.separator+userName+ File.separator+"Documents"+ File.separator;
		
		
		
		/*
		 * start of the program 
		 * User inputs
		 */
		
		/*
		 * possibly adding file explorer to select an existing folder for the school
		 */
		System.out.println("Hello Welcome to Efficient management of your Electronic Files for school");
		/*System.out.println("Do you already have a school or University folder?");
		schoolAlreadyExist = scan.next();
		if(schoolAlreadyExist.equalsIgnoreCase("Yes"))
		{
			
		}
		*/
		System.out.println("Enter the School or University you are currently Attending");
		schoolName = scan.nextLine();
		System.out.println("What is your current semester? Ex. Fall 2019");
		currentSemester = scan.nextLine();
		System.out.println("How many courses are you currently taking? Ex 5");
		numOfCourses = scan.nextInt();
		if(numOfCourses < 0)
		{
			System.out.println("I am sorry could you type a valid number? Ex 5");
			numOfCourses = scan.nextInt();
		}
		System.out.println("this is number of courses: "+numOfCourses);
		scan.nextLine();
		for(int o = 0; o<numOfCourses;o++)
		{
			System.out.println("What is the name of the "+numbercourse[o]+" course?");
			listOfCourses[o] = scan.nextLine();
		}
		
		/* this part is to add projects to specific courses
		 * and adding folders to courses such as Exam Study Guide
		 * Lecture Slides, Misc Files, Homework, etc...
		System.out.println("Do any of these courses have projects?");
		doesHaveProject = scan.nextLine();
		if(doesHaveProject.equalsIgnoreCase("yes"))
		{
			System.out.println("How many of your courses have projects?");
			numOfProjectCourse = scan.nextInt();
			for(int i = 0;i<numOfProjectCourse;i++)
			{
				System.out.println("Which of your courses have projects?");
				
				numOfProjects = scan.nextInt();
			}
			
		}
		*/
		
		// path += \\Documents\\school+Semester+currentsemester+Courses+current courses+ examstudy guide
		//															same directory		+ lecture slides
		
		// adds all the user inputs to the path
		path += schoolName+ File.separator+currentSemester+ File.separator+course;
		System.out.println(path);
		// creates the path
		System.out.println(new File(path).mkdirs());
		
		//creates a integer variable for the path length
		int pathLength = path.length();
		// adds the / to the path because we'll be adding courses
		
		
		
		// 0 to the number of courses the user has
		for(int i = 0; i < numOfCourses;i++)
		{
			// adds courses to the path
			path+= File.separator+listOfCourses[i];
			// puts the path to the File and then creates the directory.
			// Note: if we use mkdir it won't work bcuz mkdir for some reason cannot take in a certain amount of folders
			// but because we use mkdirs it extends how much we can put into the path allowing us to create the directories
			new File(path).mkdirs();
			// prints the path for testing purposes
			System.out.println("Path before subString: "+ path);
			// resets the path so we can add the other course
			path = path.substring(0, pathLength);
			// prints again for testing purposes
			System.out.println("Path after substring: "+path);
			
		}
		
	}

}
