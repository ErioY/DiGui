package JiaoGuTheory;

import java.util.Scanner;

public class 角谷定理递归 {
	static int sum=0; //计算次数
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个自然数：");
		int x=sc.nextInt();
		sc.close();
		int sum=one(x);
		System.out.println();
		System.out.println("一共经过了"+sum+"次");
		
	}
	
	public static int one(int x)
	{
		if(x==1)   //输入的自然数为1
		{
			System.out.print(x+" ");
			sum++;  
		}
		else if(x%2==0)   //输入的自然数为偶数
		{
			System.out.print(x+" ");
			one(x/2);//将这个数有限次除以2
			sum++;
		}
		else if(x%2!=0)   //输入的自然数为奇数
		{
			System.out.print(x+" ");
			one(x*3+1); //将这个数有限次乘以3再加1
			sum++;
		}
		return sum;
	}
}
