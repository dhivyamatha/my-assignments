package week1.day1;

public class Collegemarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=45;
		//if(65>75)-failed
			if(mark>75) {
				System.out.println("distinction");
			}//else if (65>60)-successful
			else if(mark>60) {
				System.out.println("first class");
			}else if(mark>50) {
				System.out.println("second class");
			}else {
				System.out.println("fail");
			}
	}

}
