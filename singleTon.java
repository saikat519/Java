package OOPS;

public class singleTon {

	public String s;
	
	private singleTon() {
		s="I am a string from singleTon class";
	}
	
	private static singleTon obj = null;
	
	public static singleTon getInstance() {
		if(obj==null) {
			obj=new singleTon();
		}
		return obj;
	}

}
// comment for git



