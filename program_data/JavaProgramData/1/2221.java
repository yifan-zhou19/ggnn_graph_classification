package <missing>;

public class GlobalMembers
{
	public static int w = 1;
	public static int f(int x)
	{
		int z = 1;
		int y;
		int v = 0;
		for (y = w + 1;y <= Math.sqrt(x);y++)
		{
			if (x % y == 0)
			{

				z = z + f(x / y);
				v++;
				w = y;
			}
		}
		if (v == 0)
		{
		z = 1;
		}
		return z;
	}
	public static int Main()
	{
		int n;
		int u = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(a));
			u++;
			w = 1;
		} while (u != n);
	}

}

