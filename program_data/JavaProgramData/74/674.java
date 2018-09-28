package <missing>;

public class GlobalMembers
{
	public static int k(int n)
	{
		int o;
		int i;
		int t;
		int m = 0;
		t = n;
		for (i = 0;n != 0;i++)
		{
		m = 10 * m + n % 10;
		n = n / 10;
		}
		if (m == t)
		{
			o = 1;
		}
		else
		{
			o = 0;
		}
		return (o);
	}
	public static int p(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i == n)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int i;
		int m;
		int n;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (k(i) == 1 && p(i) == 1)
			{
				t++;
				if (t == 1)
				{
				System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}



}

