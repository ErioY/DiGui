package DuckSale;

public class 卖鸭子递归 
{
	static int sum;
	public static void main(String[] args)
	{
		int n=1;
		int num;//每个村子卖出的鸭子数
		int sum=one(n);   //刚开始的鸭子数,n个村子
		System.out.println("刚开始有"+sum+"只鸭子");
		for(int i=1;i<8;i++)//循环输出经过每个村子卖出的鸭子数
		{
			num=sum/2+1;
			sum-=num;  //剩余鸭子数
			System.out.println("经过第"+i+"个村子卖出了"+num+"只鸭子,还剩下"+sum+"只鸭子");
		}
	}
	
	public static int one(int n)
	{
		if(n<8)
		{
			return 2*(one(n+1)+1);
		}
		else if(n==8)
		{
			return 2;
		}
		return n;
	}
}
