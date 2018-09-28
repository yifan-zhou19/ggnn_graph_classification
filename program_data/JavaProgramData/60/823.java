package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int a;
		int b = 0;
		for (i = 2;i < x;i++)
		{
			if (x % i != 0)
			{
				a = 0;
			}
			else
			{
				a = 1;
			}
			if (a == 0 && b == 0)
			{
				b = 0;
			}
			else
			{
				b = 1;
			}
		}
		if (b == 1)
		{
			return 1;
		}
		if (b == 0)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int j;
		int z = 0;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 2;j <= n - 2;j++)
		{

		g = f(j);
			h = f(j + 2);
			if (g == 0 && h == 0)
			{
				System.out.printf("%d %d\n",j,j + 2);
			z = 1;
			}

		}

		if (z == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

