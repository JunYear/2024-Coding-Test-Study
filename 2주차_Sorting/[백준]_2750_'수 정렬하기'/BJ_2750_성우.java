//package 2����_Sorting.[����]_2750_'�� �����ϱ�';
// ������ �ڹ��ڵ�� �ٷ� �ۼ��ϴµ��� �ð��� 10�гѰ� �����
// �ڹپ� ��� ���� ����ؼ� �ڹٿ� ���� ���İ� ���õ��� �����ϴٰ� ������ �ȴ�.
// �� Ǯ�� �ٸ� ����� Ǯ�̸� ���� �ڹٿ� �ִ� Ư�� �Լ��� �̿��ϴ� ���� ���� ���� Ǯ�� ����� �˰� �Ǿ���.

import java.util.*;
public class BJ_2750_���� {
    public static void main(String[] args) {
		
		Scanner nu = new Scanner(System.in);
		
		int N = nu.nextInt();					
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = nu.nextInt();
		}
		
		for (int i = 0; i < N - 1; i++) {			
			int temp = 0;						
			for (int j = i + 1; j < N; j++) {	 // ���� ����	
				if (num[j] > num[i]) {							
					temp = num[j];		// temp(�ӽ�) ������ num[j]�� �̸� ���� �ִ´�.
					num[j] = num[i];	//  num[i]���� num[j] ���� �ִ´� 
					num[i] = temp;      //  ��ó�� ���� temp(�ӽ�)������ ���� num[i] �־ �ڸ���ȯ�� �ȴ�.
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(num[i]);
		}
	}
}