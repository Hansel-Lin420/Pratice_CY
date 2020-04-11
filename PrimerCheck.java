
public class PrimerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int limit = 100;
for(int i =2; i < limit;i++) {
	if(isPrimer(i)) {
		System.out.print(i+", ");
	}
}
	}

	private static boolean isPrimer(int n) {
		// TODO Auto-generated method stub
		
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}

}
