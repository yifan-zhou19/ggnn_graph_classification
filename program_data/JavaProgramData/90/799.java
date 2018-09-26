package <missing>;

public class GlobalMembers
{
	/////?????/////
	public static int f(int x,int y)
	{
		int z;
		int z1;
		int z2;
		int q;
		if ((y == 1) || (x == 0))
		{
			z = 1;
		}
		else
		{
			if ((x < y))
			{
				z = f(x, x);
			}
			else
			{
				z = f(x, y - 1) + f(x - y, y);
			}
		}
		return z;
	}
	/////???/////
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			k = f(m, n);
			System.out.printf("%d\n",k);
		}
		return 0;
	}
}

