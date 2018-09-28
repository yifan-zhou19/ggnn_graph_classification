package <missing>;

public class GlobalMembers
{
	public static int checkp(int n)
	{
		int i;
		if (n % 2 == 0)
		{
			if (n == 2)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		for (i = 3;i * i <= n;i = i + 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int checkr(int n)
	{
		int a = 0;
		int b;
		b = n;
		while (n / 10 != 0)
		{
			a = a * 10 + n % 10;
			n = n / 10;
		}
		a = a * 10 + n;
		if (a == b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		for (i = m;i <= n;++i)
		{
			if (checkp(i) != 0 && checkr(i) != 0)
			{
				System.out.printf("%d",i);
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (j = i + 1;j <= n;++j)
			{
				if (checkp(j) != 0 && checkr(j) != 0)
				{
					System.out.printf(",%d",j);
				}
			}
		}
	}







}

