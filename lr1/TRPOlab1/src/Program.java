import java.util.ArrayList;

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

		Repository studentRepository = new Repository<Student>();
		
		studentRepository.Add(new Student(studentsScores[0], true, false, "Vadim"));
		studentRepository.Add(new Student(studentsScores[1], true, false, "Daniil"));
		studentRepository.Add(new Student(studentsScores[2], true, false, "Keker"));
		studentRepository.Add(new Student(studentsScores[3], true, false, "Doter"));
		studentRepository.Add(new Student(studentsScores[4], true, false, "Vladislav"));
		studentRepository.Add(new Student(studentsScores[5], false, false, "Petya"));
		studentRepository.Add(new Student(studentsScores[6], false, false, "Kostya"));
		studentRepository.Add(new Student(studentsScores[7], false, false, "Vlad"));
		studentRepository.Add(new Student(studentsScores[8], false, false, "Ibragim"));
		studentRepository.Add(new Student(studentsScores[9], false, false, "Ivan"));
		studentRepository.Add(new Student(studentsScores[10], true, true, "Misha"));
		studentRepository.Add(new Student(studentsScores[11], false, true, "Egor"));
		studentRepository.Add(new Student(studentsScores[12], false, true, "Anton"));
		studentRepository.Add(new Student(studentsScores[13], false, true, "Maksim"));
		studentRepository.Add(new Student(studentsScores[14], true, true, "Anatoliy"));
		studentRepository.Add(new Student(studentsScores[15], false, true, "Vitya"));
		studentRepository.Add(new Student(studentsScores[16], false, true, "Grisha"));
		studentRepository.Add(new Student(studentsScores[17], false, true, "Matvey"));
		studentRepository.Add(new Student(studentsScores[18], true, true, "Lemon"));
		studentRepository.Add(new Student(studentsScores[19], false, true, "Kesha"));
		
		int averageScore = 0;
		
		for (int i = 0; i < studentRepository.GetSize(); i++) {
			Student student = (Student)studentRepository.GetItem(i);
			if(!student.GetStateEmployee()) {
				System.out.println(student.GetAllInfo());
			}
			averageScore += student.GetAverageSessionScore();
		}
		
		
		System.out.println("Average score of all students: " + averageScore / studentRepository.GetSize());
	}
}
