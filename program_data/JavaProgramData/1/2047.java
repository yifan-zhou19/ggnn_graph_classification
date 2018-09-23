package <missing>;

public class GlobalMembers
{
	public static int sum = 1;
	public static void f(int i,int j)
	{
		int k;
		if (i == 1)
		{
			sum++;
		}
		else
		{
			for (k = j;k <= i;k++)
			{
				if (i % k == 0)
				{
					f(i / k, k);
				}
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			sum = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (i = 2;i * i <= a;i++)
			{
				if (a % i == 0)
				{
					f(a / i, i);
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

