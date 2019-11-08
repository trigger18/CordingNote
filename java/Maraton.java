public class Maraton {
	public static void main(String[] args) {
		//String[] participant = {"leo", "kiki", "eden"};
		//String[] completion= {"kiki", "eden"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; //동명이인일 경우
		String[] completion= {"stanko", "mislav", "ana"};
		String res = solution(participant, completion);
		System.out.print(res);
	}// end main()
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		for (int i = 0; i < completion.length; i++) {
			for (int j = 0; j < participant.length; j++) {
				if (completion[i].equals(participant[j])) {
					participant[j] = " ";
					break;
				}
			}
		}
		for (int i = 0; i < participant.length; i++) {
			if (!(participant[i].equals(" ")))
				answer = participant[i];
		}
		return answer;
	}// end solution
}// end class
