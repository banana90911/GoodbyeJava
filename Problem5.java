package practicePackage;

public class Problem5 {

	public static void main(String[] args) {
		int[] array = {0, 0, 0, 0, 0, 0};
		int counter = 0;
		
		while (counter < 6) {
			int rand = (int)(Math.random()*45) + 1;
			
			for (int i = 0; i < 6; i++) {
				if (rand != array[i]) {
					array[i] = rand;
					System.out.print(rand + "\t");
					counter += 1;
					break;
				}
			}
		}
		
	}

}
