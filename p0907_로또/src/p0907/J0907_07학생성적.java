package p0907;

import java.util.Scanner;

public class J0907_07학생성적 {

	public static void main(String[] args) {
		// 학생 성적 프로그램
//선언

		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0;// 학생수
		String[] subject = { "국어", "영어", "수학" };
		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균" };
		int[] stuNo = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];

		loop: while (true) {

			System.out.println("---------------------------------------------------");
			System.out.println("------------ 학생 성적 프로그램--------------------------");
			System.out.println("----------------------------------------------------");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("0.종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
				
			switch (choice) {
			case 1:
				System.out.println("[  성적입력 확면   ]");
				System.out.println("----------------------");
				System.out.println();
				for (int i = count; i < 10; i++) {
					stuNo[i] = count + 1;// 1,2,3.4,5.
					System.out.println((count + 1) + "번째 이름을 입력하세요(이전화면: 0)");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println();
						break;
					}
					for (int j = 0; j < 3; j++) {
						System.out.println(subject[j] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
					// 합계
					total[i] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = total[i] / 3.0;
					count++;
				}
				System.out.println();
				break;
			case 2:
				System.out.println("-------------------------------------------------");
				System.out.println("                     겅정출력");
				System.out.println("--------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
				for(int i= 0;i<count;i++) {
					System.out.printf("%d\t",stuNo[i]);
					System.out.printf("%s\t",name[i]);
					//국어 영어. 수학 점수 출력
				    for (int j=0;j<3;j++) {
				    	System.out.printf("%d\t",score[i][j]);
				    }
				    System.out.printf("%d\t",total[i]);
				    System.out.printf("%.2f\n",avg[i]);
				}
				
				
				
				
				
			case 0:
				System.out.println("[프로그램 종료]");
				System.out.println();
				break loop;

			}// switch
		} // while

	}// main
}
