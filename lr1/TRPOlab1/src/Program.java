public class Program {
	public static void main(String[] args) {
		int[][] studentsScores = {
				{1, 2, 3, 6, 5},
				{4, 4, 4, 4, 4},
				{1, 2, 3, 5, 8},
				{1, 2, 3, 4, 5},
				{6, 4, 8, 3, 5},
				{6, 9, 6, 8, 9},
				{1, 2, 3, 4, 5},
				{6, 8, 7, 7, 10},
				{7, 8, 8, 6, 6},
				{9, 5, 8, 8, 6},
				{8, 8, 8, 8, 8},
				{7, 8, 6, 7, 7},
				{6, 4, 8, 3, 5},
				{6, 9, 6, 8, 9},
				{1, 2, 3, 4, 5},
				{6, 8, 7, 7, 10},
				{7, 8, 8, 6, 6},
				{9, 5, 8, 8, 6},
				{8, 8, 8, 8, 8},
				{7, 8, 6, 7, 7}
		};

		Student[] students = {
				new Student(studentsScores[0], true, false, "Vadim"),
				new Student(studentsScores[1], true, false, "Daniil"),
				new Student(studentsScores[2], true, false, "Keker"),
				new Student(studentsScores[3], true, false, "Doter"),
				new Student(studentsScores[4], true, false, "Vladislav"),
				new Student(studentsScores[5], false, false, "Petya"),
				new Student(studentsScores[6], false, false, "Kostya"),
				new Student(studentsScores[7], false, false, "Vlad"),
				new Student(studentsScores[8], false, false, "Ibragim"),
				new Student(studentsScores[9], false, false, "Ivan"),
				new Student(studentsScores[10], true, true, "Misha"),
				new Student(studentsScores[11], false, true, "Egor"),
				new Student(studentsScores[12], false, true, "Anton"),
				new Student(studentsScores[13], false, true, "Maksim"),
				new Student(studentsScores[14], true, true, "Anatoliy"),
				new Student(studentsScores[15], false, true, "Vitya"),
				new Student(studentsScores[16], false, true, "Grisha"),
				new Student(studentsScores[17], false, true, "Matvey"),
				new Student(studentsScores[18], true, true, "Lemon"),
				new Student(studentsScores[19], false, true, "Kesha")
				};
		
		float averageScore = 0;
		
		for (int i = 0; i < students.length; i++) {
			if(!students[i].GetStateEmployee()) {
				System.out.println(students[i].GetAllInfo());
			}
			averageScore += students[i].GetAverageSessionScore();
		}
		
		System.out.println("Average score of all students: " + averageScore / students.length);
	}
}
