package DuckSale;

public class ��Ѽ�ӵݹ� 
{
	static int sum;
	public static void main(String[] args)
	{
		int n=1;
		int num;//ÿ������������Ѽ����
		int sum=one(n);   //�տ�ʼ��Ѽ����,n������
		System.out.println("�տ�ʼ��"+sum+"ֻѼ��");
		for(int i=1;i<8;i++)//ѭ���������ÿ������������Ѽ����
		{
			num=sum/2+1;
			sum-=num;  //ʣ��Ѽ����
			System.out.println("������"+i+"������������"+num+"ֻѼ��,��ʣ��"+sum+"ֻѼ��");
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
