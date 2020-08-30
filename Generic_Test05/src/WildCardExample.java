import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������:" + 
				Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudents(Course<? extends Students> course) {
		System.out.println(course.getName() + "������:" + 
				Arrays.toString(course.getStudents()));
	}

}
