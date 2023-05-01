package Green;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GetAge2 {
	int year;
	int month;
	int day;


	public GetAge2(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getAge() {
		LocalDate birth = LocalDate.of(year, month, day);
		LocalDate present = LocalDateTime.now().toLocalDate();
		//생일의 년 추출
		int birthYear = birth.getYear();
		//생일의 월 추출
		int birthMonth = birth.getMonthValue();
		//생일의 일 추출
		int birthDay = birth.getDayOfMonth();
		//당해년도의 년 추출
		int presentYear = present.getYear();
		//당해년도의 월 추출
		int presentMonth = present.getMonthValue();
		//당해년도의 일 추출
		int presentDay = present.getDayOfMonth();

		if (birthMonth > presentMonth) {
			return presentYear - birthYear-1;
		}

		if (birthMonth < presentMonth) {
			return presentYear - birthYear;

		}

		if (birthMonth == presentMonth){
			if (birthDay < presentDay) {
				return presentYear - birthYear;
			}
			if(birthDay >= presentDay){
				return presentYear - birthYear-1;
			}
		}
		return 0;
	}


	 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("태어난 해의 년도를 입력하세요");
		int year = scanner.nextInt();
		System.out.println("태어난 해의 월을 입력하세요");
		int month = scanner.nextInt();
		System.out.println("태어난 해의 일을 입력하세요");
		int day = scanner.nextInt();
		GetAge2 getage = new GetAge2(year, month, day);


		System.out.println("당신의 만 나이는 "+getage.getAge()+"살 입니다.");


	}

}
