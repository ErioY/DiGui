package DuckSale;

public class ��Ѽ�ӷǵݹ�
{
	static int sum=2;//Ѽ������
	public static void main(String[] args)
	{
		int num;
		for(int i=1;i<8;i++)
		{
			sum=(sum+1)*2;//ѭ�������Ѽ������
		}
		System.out.println("һ����"+sum+"ֻѼ��");
		for(int i=1;i<8;i++)
		{
			num=sum/2+1;
			sum-=num;
			System.out.println("������"+i+"����������"+num+"ֻѼ�ӣ���ʣ"+sum+"ֻѼ��");
		}
	}
}
