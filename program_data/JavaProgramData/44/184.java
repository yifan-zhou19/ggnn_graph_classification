package <missing>;

public class GlobalMembers
{
	public static int MI(int x)
	{
		int a;
		int mul = 1;
		for (a = 0;a < x;a++)
		{
					 mul = mul * 10;
		}
		return mul;
	}
	public static int reverse(int num)
	{
		int a = 1;
		int count;
		int i;
		int n;
		int plus = 0;
		int c = 2;
		int remove;
		for (count = 0;a != 0;count++)
		{
					 a = num / MI(count);
		}
		for (i = 1;i <= count - 1;i++)
		{
					a = num / MI(count - c);
					plus = plus + a * MI(i - 1);
					num = num - a * MI(count - c);
					c++;
		}
		return plus;
	}
	public static int Main()
	{
		  int[] n = new int[10001];
		  int[] answer = new int[7];
		  int i;
		  for (i = 1;i <= 6;i++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n[i - 1] = Integer.parseInt(tempVar);
		  }
		  answer[i - 1] = reverse(n[i - 1]);
		  }
		  for (i = 1;i <= 6;i++)
		  {
		  System.out.printf("%ld\n",answer[i - 1]);
		  }
		  System.in.read();
		  System.in.read();
	}

}

