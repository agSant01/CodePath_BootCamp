
import java.util.Scanner;

public class GoldStars {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int[] studentGrades;
		int students;

		System.out.print("Enter the amount of students: ");
		students = in.nextInt();

		studentGrades = new int[students];

		for (int i = 0; i < students; i++){
			studentGrades[i] = in.nextInt(); 
		}

		System.out.println(goldStars(studentGrades));

		in.close();
		return;
	}

	public static int goldStars(int[] studentGrades){
		int[] starsGiven = new int[studentGrades.length];
		int sum = 0;

		for (int i = 0; i < starsGiven.length; i++){
			starsGiven[i]++;
			if(i < studentGrades.length-1 &&
					studentGrades[i] > studentGrades[i+1])
			{
				starsGiven[i]++;
			} else if( i > 0 && 
					studentGrades[i] > studentGrades[i-1])
			{
				starsGiven[i]++;
			}

			if(i > 0 && 
					studentGrades[i] == studentGrades[i-1] &&
					starsGiven[i] < starsGiven[i-1])
			{
				starsGiven[i]++; 
			}else if(i < studentGrades.length-1 &&
					studentGrades[i] > studentGrades[i+1] &&
					starsGiven[i] < starsGiven[i+1])
			{
				starsGiven[i]++;
			}
			sum += starsGiven[i];
		}
		return sum;
	}

}
