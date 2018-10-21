package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = new int(int x,int y);
		int i;
		int t;
		int[] m = new int[21];
		int[] n = new int[21];
		int[] c = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= t;i++)
		{
			c[i] = sum(m[i], n[i]);
		}
		for (i = 1;i <= t;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
	}
	public static int sum(int x,int y)
	{
		int z;
		if (y == 1)
		{
			z = 1;
		}
		else
		{
			if (x < 0)
			{
			z = 0;
			}
		else
		{
			z = sum(x, y - 1) + sum(x - y, y);
		}
		}
		return (z);
	}

}

