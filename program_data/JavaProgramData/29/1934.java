package <missing>;

public class GlobalMembers
{
	public static int fibo(int n)
	{
		int a;
		 if (n == 1)
		 {
			 a = 1;
		 }
		 else if (n == 2)
		 {
			 a = 2;
		 }
			  else
			  {
				  a = fibo(n - 1) + fibo(n - 2);
			  }
		return a;
	}
	public static int Main()
	{
		int n;
		int m;
		double sum = 0.0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= k;j++)
			{
				sum = sum + (double)fibo(j + 1) / fibo(j);
			}
			System.out.printf("%.3f\n",sum);
			sum = 0;
		}
		return 0;
	}

}

