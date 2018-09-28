package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int r = 1;
		if (y == 1 || x == 0 || x == 1)
		{
		  return 1;
		}
		if (y == 0)
		{
		  return 0;
		}
		if (y > x)
		{
		  y = x;
		}
		r = f(x - y, y) + f(x, y - 1);
		return r;
	}
	public static int Main()
	{
		int t;
		int[] m = new int[20];
		int[] n = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < t;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					n[i] = Integer.parseInt(tempVar3);
				}
		}
		for (int i = 0;i < t;i++)
		{
				System.out.printf("%d\n",f(m[i], n[i]));
		}
		return 0;
	}
}

