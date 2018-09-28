package <missing>;

public class GlobalMembers
{
	public static int y = 0;
	public static int anti(int x)
	{
		y = 10 * y + x % 10;
		x = x / 10;
		if (x != 0)
		{
			anti(x);
		}
		return (y);
	}
	public static int su(int n)
	{
		int i;
		int a = 1;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				a = 0;
			}
		}
		return a;
	}
	public static void Main()
	{
		int x1;
		int x2;
		int m;
		int n = 0;
		int a;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x2 = Integer.parseInt(tempVar2);
		}
		for (i = x1;i <= x2;i++)
		{
			m = anti(i);
			y = 0;
			a = su(i);
			if (m == i && a == 1)
			{
				j++;
				if (j == 1)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
			else
			{
				n++;
			}
		}
		if (n - 1 == x2 - x1)
		{
			System.out.print("no");
		}
	}



}

