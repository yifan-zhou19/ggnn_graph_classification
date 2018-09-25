package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int k;
		int t;
		int j = 0;
		int f1 = i;
		int f2 = i;
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
			k = f1(i);
			t = f2(i);
			if (k == 1 && t == 1)
			{
				if (j == 0)
				{
					System.out.printf("%d",i);
					j = j + 1;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}

		}
		if (j == 0)
		{
				System.out.print("no");
		}
	}

	public static int f1(int i)
	{
		int k;
		int j;
		k = Math.sqrt(i);
		for (j = 2;j <= k;j++)
		{
			if (i % j == 0)
			{
				break;
			}
		}
		if (j >= k + 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int f2(int i)
	{
		int n;
		int j;
		int m;
		int a;
		int b;
		int e;
		for (n = 0;;n++)
		{
			if (i < Math.pow(10,n))
			{
				break;
			}
		}
		m = (int)n / 2;
		for (j = 0;j < m;j++)
		{
			e = n - j - 1;
			a = (int)(i / Math.pow(10,j)) - ((int)(i / Math.pow(10,j + 1))) * 10;
			b = (int)(i / Math.pow(10,e)) - ((int)(i / Math.pow(10,e+1))) * 10;
			if (a != b)
			{
				break;
			}
		}
		if (j >= m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

