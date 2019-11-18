import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("기본형식: " + cal.getTime());
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("오늘은 " + days[cal.get(Calendar.DAY_OF_WEEK) - 1] + "요일");
		System.out.println(Calendar.DAY_OF_WEEK); // 7
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 2
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("형식 적용 : " + sf.format(cal.getTime())); //2019년 11월 18일 09시 56분 17초
		cal.add(Calendar.DATE, 1);
		System.out.println("하루 증가 : " + sf.format(cal.getTime())); //2019년 11월 19일 09시 57분 19초
		cal.add(Calendar.YEAR, 1);
		System.out.println("1년 증가 : " + sf.format(cal.getTime())); //2020년 11월 19일 09시 58분 39초 
	}// end main()
}// end class
