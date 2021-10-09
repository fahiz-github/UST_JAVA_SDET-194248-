package com.ust.test;

public class Labeled_Break {

	public static void main(String[] args) {
		first_label:
			for(int i=0;i<10;i++) {
				seconed_label:
					for(int k=0;k<4;k++) {
						System.out.println(i+" "+k);
						if(i==4) {
							break first_label;
							
						}
					}
					
			}

	}

}

/* output
 0 0
0 1
0 2
0 3
1 0
1 1
1 2
1 3
2 0
2 1
2 2
2 3
3 0
3 1
3 2
3 3
4 0
*/

