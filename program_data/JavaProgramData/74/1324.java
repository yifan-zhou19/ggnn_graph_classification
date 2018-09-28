package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int m = 1;
		int a;
		int i;
		for (i = 1;i <= n;i = i * 10)
		{
			m = i;
		}
		if (n < 10)
		{
			a = n;
		}
		else
		{
			a = n % 10 * m + judge(n / 10);
		}
		return a;
	}
	public static int su(int n)
	{
		int i;
		int m = 0;
		for (i = 2;i <= n / 2;i++)
		{
			if (n % i == 0)
			{
				m++;
			}
		}
		if (m > 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			t = 0;
			if (i % 2 == 1 && judge(i) == i && su(i) != 0)
			{
				System.out.printf("%d",i);
				for (j = i + 1;j <= n;j++)
				{
					if (j % 2 == 1 && judge(j) == j && su(j) != 0)
					{
						t++;
					}
				}
				if (t > 0)
				{
					System.out.print(",");
				}
			}
		}
		t = 0;
		for (i = m;i <= n;i++)
		{
			if (i % 2 == 1 && judge(i) == i && su(i) != 0)
			{
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}
}

