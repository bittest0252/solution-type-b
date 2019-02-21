package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int v_max =0, v_idx1 = 0, v_idx2 = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int tmp = arr[i] * arr[j];
				if(tmp > 0 && tmp > v_max) {
					v_max = tmp;
					v_idx1 = arr[i]; 
					v_idx2 =arr[j];
				}
			}
		}
		System.out.printf("[%s,%s]",v_idx1,v_idx2);
	}
}
