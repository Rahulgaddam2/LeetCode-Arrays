package Arrays;

import java.util.List;
import java.util.ArrayList;

public class LeetCode54 {

	public static void main(String[] args) {
		LeetCode54 object = new LeetCode54();
		
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(object.method(array));

	}
	public List<Integer> method(int[][] array){
		
		List<Integer> result = new ArrayList<>();
		
		int T =0;
		int B =array.length-1;
		int L =0;
		int R =array[0].length-1;
		
		int direction = 0;  // 0 -> right , 1 -> Buttom , 2 -> left , 3 -> top
		
		while(L <= R && T <= B) {
			switch(direction) {
			case 0:
				for(int i=L; i<=R; i++) {
					result.add(array[T][i]);
				}
				T++;
				break;
			case 1:
				for(int i=T; i<=B; i++) {
					result.add(array[i][R]);
				}
				R--;
				break;
			case 2:
				for(int i=R; i>=L; i--) {
					result.add(array[B][i]);
				}
				B--;
				break;
			case 3:
				for(int i=B; i>=T; i--) {
					result.add(array[i][L]);
				}
				L++;
				break;
			}
			direction = (direction+1)%4;
			
		}
		
		return result;	
	}

}
