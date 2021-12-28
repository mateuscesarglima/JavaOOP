package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		
		for( int i = 0; i < 50; i++) {
			list.add(i);
		}
		
		for(Integer num : list) {
			System.out.println(num);
		}
	}
    
}

