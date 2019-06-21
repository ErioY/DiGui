package JiaoGuTheory;

import java.util.Scanner;

public class 角谷定理非递归 {
	static int sum=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个自然数：");
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
		System.out.println("一共经过了"+sum+"次");
	}
}
