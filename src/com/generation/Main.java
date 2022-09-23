package com.generation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent( studentId, "sport_01" );
        courseService.displayStudentInformation( studentId);
        courseService.totalCredits(studentId);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
	}

}
