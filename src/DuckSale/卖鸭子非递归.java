package DuckSale;

public class 卖鸭子非递归
{
	static int sum=2;//鸭子总数
	public static void main(String[] args)
	{
		int num;
		for(int i=1;i<8;i++)
		{
			sum=(sum+1)*2;//循环计算出鸭子总数
		}
		System.out.println("一共有"+sum+"只鸭子");
		for(int i=1;i<8;i++)
		{
			num=sum/2+1;
			sum-=num;
			System.out.println("经过第"+i+"个村子卖了"+num+"只鸭子，还剩"+sum+"只鸭子");
		}
	}
}
