package JiaoGuTheory;

import java.util.Scanner;

public class �ǹȶ���ǵݹ� {
	static int sum=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ����Ȼ����");
		int x=sc.nextInt();
		sc.close();
		while(x>=1)
		{
			if(x==1)
			{
				sum++;
				System.out.println(x);
				break;
			}
			else if(x%2==0)
			{
				System.out.print(x+" ");
				sum++;
				x=x/2;
				
			}
			else if(x%2!=0)
			{
				System.out.print(x+" ");
				sum++;
				x=x*3+1;
			}
		}
		System.out.println("һ��������"+sum+"��");
	}
}
