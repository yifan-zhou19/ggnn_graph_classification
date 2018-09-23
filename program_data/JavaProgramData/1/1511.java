package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		int sum = 1;
		int i;
		if (n < m)
		{
			sum = 0;
		}
		else
		{
			if (n == m)
			{
				sum = 1;
			}
		else
		{
			for (i = m;i <= n;i++)
			{
				if (n % i == 0)
				{
					sum = sum + f(n / i, i);
				}
			}
		}
		}
		return (sum);
	}
	public static void Main()
	{
		int x;
		int j;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (j = 0;j < x;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < x;j++)
		{
			System.out.printf("%d\n",f(a[j], 2));
		}
	}

}

