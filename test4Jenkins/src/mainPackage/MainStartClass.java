package mainPackage;

public class MainStartClass {
	public static void main(String[] args){
		System.out.println("Hello World random java code");
		for(int i = 0; i < 10 ; i++){
			i = i + 1;
			System.out.println(i + " :is the current run");
			
		}
		
		DummyCommitClass test = new DummyCommitClass();
		test.setTestString("this is a simple test to ...");
		System.out.println(test.getTestString());
	}
}

