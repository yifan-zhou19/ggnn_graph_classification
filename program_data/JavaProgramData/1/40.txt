package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x, int y);
		int n;
		int m;
		int i;
		int z;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			z = f(1, m);
			System.out.printf("%d\n",z);
		}

		return 0;
	}

	public static int f(int x, int y)
	{
		int z;
		int t = 1;
		int l = 0;
		int p;
		p = (int) Math.pow(y,0.5);
		if (x == 1)
		{
			x = 2;
		}
		for (z = x;z <= p;z++)
		{
			if (y % z == 0 && z != y)
			{
				t += f(z, y / z);
			}
		}

		return t;
	}
}

