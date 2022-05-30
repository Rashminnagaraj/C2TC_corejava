package corejava_package;
 class a {
	
}


public class finalee extends a {
	final int speedlimit=98;
	void run() {
speedlimit=400;	
	}

	public static void main(String[] args) {
		finalee obj=new finalee() ;
		obj.run();

	}

}
