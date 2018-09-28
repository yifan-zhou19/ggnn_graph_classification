package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		float sum;
		int i;
		int j;
		int[] k = new int[100];
		int Fibonacci = int;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			sum = 0F;
			for (j = 0;j < k[i];j++)
			{
				sum = (float)Fibonacci(j + 1) / Fibonacci(j) + sum;
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
	public static int Fibonacci(int k)
	{
		int[] a = {1, 2};
		int j = 0;
		int i = 0;
		if (k == 1)
		{
			return a[1];
		}
		else if (k == 0)
		{
			return a[0];
		}
		else if (k >= 2)
		{
			for (i = 2;i <= k;i++)
			{
				a[j] = a[j] + a[1 - j];
				j = 1 - j;
			}
			   return a[1 - j];
		}
	}
}

