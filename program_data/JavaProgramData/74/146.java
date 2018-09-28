package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;

	public static int zhi(int n)
	{
		int i;
		int t;
		t = n / 2;
		for (i = 2;i < t;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int hui(int n)
	{
		int temp;
		int h;
		temp = n;
		h = 0;
		while (temp > 0)
		{
			h = h * 10 + temp % 10;
			temp /= 10;
		}
		if (n == h)
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
		int i;
		int flag = 1;
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
			if (hui(i) != 0 && zhi(i) != 0)
			{
				if (flag != 1)
				{
					System.out.printf(",%d",i);
				}
				else
				{
					System.out.printf("%d",i);
					flag = 0;
				}
			}
		}
	if (flag == 1)
	{
	System.out.print("no");
	}
	//	scanf("%d%d",&m,&n);
		return 0;
	}
}

