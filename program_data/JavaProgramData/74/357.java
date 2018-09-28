package <missing>;

public class GlobalMembers
{
	public static int zhishu(int x)
	{
	int b;
	int j;
	b = (int)Math.sqrt(x);
	for (j = 2;j <= b;j++)
	{
	if (x % j == 0)
	{
		break;
	}
	}
	if (j != (b + 1))
	{
		return (0);
	}
	else
	{
		return (1);
	}
	}

	public static int nixu(int x,int z)
	{
		if (x == 0)
		{
			return z;
		}
		else
		{
			return nixu(x / 10, z * 10 + x % 10);
		}
	}

	public static int huiwen(int x)
	{
		if (x == nixu(x, 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int count = 0;
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
			if (zhishu(i) != 0 && huiwen(i) != 0)
			{
				count = i;
			}
		}
		if (count == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = m;i <= n;i++)
			{
				if (zhishu(i) != 0 && huiwen(i) != 0)
				{
					System.out.printf("%d",i);
					if (i != count)
					{
						System.out.print(",");
					}
				}
			}
		}
		System.out.print(10);
	}

}

