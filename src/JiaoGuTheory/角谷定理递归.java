package JiaoGuTheory;

import java.util.Scanner;

public class �ǹȶ���ݹ� {
	static int sum=0; //�������
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ����Ȼ����");
		int x=sc.nextInt();
		sc.close();
		int sum=one(x);
		System.out.println();
		System.out.println("һ��������"+sum+"��");
		
	}
	
	public static int one(int x)
	{
		if(x==1)   //�������Ȼ��Ϊ1
		{
			System.out.print(x+" ");
			sum++;  
		}
		else if(x%2==0)   //�������Ȼ��Ϊż��
		{
			System.out.print(x+" ");
			one(x/2);//����������޴γ���2
			sum++;
		}
		else if(x%2!=0)   //�������Ȼ��Ϊ����
		{
			System.out.print(x+" ");
			one(x*3+1); //����������޴γ���3�ټ�1
			sum++;
		}
		return sum;
	}
}
