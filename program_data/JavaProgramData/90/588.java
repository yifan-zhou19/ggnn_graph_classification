package <missing>;

public class GlobalMembers
{
	public static int sweet(int x,int y)
	{
		if (x < y)
		{
			y = x;
		}
		if ((x == 1) || (y == 0) || (y == 1))
		{
			return 1;
		}
		else
		{
			return sweet(x - y, y) + sweet(x, y - 1);
		}
	}
	public static int Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
		int n;
		int i;
		int[] honey = new int[100];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			honey[i] = sweet(x[i], y[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",honey[i]);
		}
		return 0;
	}


}

