package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		for (i = 3;i <= Math.sqrt(a);i += 2)
		{
			if (a % i == 0)
			{
				return (0);
				break;
			}
		}
		return (1);
	}

	public static int g(int b)
	{
		int n = 0;
		int i;
		int c;
		c = b;
		while (c > 0)
		{
			n = n * 10 + c % 10;
			c = c / 10;
		}
		if (n == b)
		{
			return (1);
		}
		else
		{
			return (0);
		}


	}


	public static int Main()
	{
		int m;
		int n;
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
		if (m <= 2)
		{
			System.out.print("2,");
		}
		int j;
		int flag = 0;
		if (m % 2 == 0)
		{
			m = m + 1;
		}
		for (j = m;j <= n;j += 2)
		{
			if (g(j) != 0 && f(j) != 0)
			{
				flag = 1;
				System.out.printf("%d",j);
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		for (j = j + 2;j <= n;j += 2)
		{
			if (f(j) != 0 && g(j) != 0)
			{
				flag = 1;
				System.out.printf(",%d",j);
			}
		}
	}





}

