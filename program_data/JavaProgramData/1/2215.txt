package <missing>;

public class GlobalMembers
{
	public static int f(int t)
	{
		double v = Math.sqrt(t) + 1;
		for (int i = 2; i < v; i++)
		{
		if (t % i == 0)
		{
			return 0;
		}
		}
		return 1;
	}
	public static int sum = 0;
	public static void fun(int n,int i)
	{
		 if (n == 1)
		 {
		 sum++;
		 }
		 while (i <= n)
		 {
		 if (n % i == 0)
		 {
		 fun(n / i, i);
		 }
		 i++;
		 }
		return;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		  int a;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  if (f(a) > 0)
		  {
		  System.out.print("1\n");
		  continue;
		  }
		  int i = 2;
		  int K = 1;
		  while (i <= a / 2)
		  {
			if (a % i == 0)
			{
			sum = 0;
			fun(a / i, i);
			K += sum;
			}
			i++;
		  }
			System.out.printf("%d\n",K);
		}
	}
}

