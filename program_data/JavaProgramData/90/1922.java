package <missing>;

public class GlobalMembers
{
	public static int fenfa(int x, int y)
	{
		int r;
		if (x == 1)
		{
			r = 1;
		}
		else if (y == 1)
		{
			r = 1;
		}
		else if (x != 1 && y != 1 && x < y)
		{
			r = fenfa(x, y - 1);
		}
		else if (x != 1 && y != 1 && x >= y)
		{
			r = fenfa(x, y - 1) + fenfa(x - y, y);
		}
		return r;
	}
	public static int Main()
	{
		int t;
		int[] M = new int[25];
		int[] N = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] K = new int[25];
		for (i = 0;i < t;i++)
		{
			K[i] = fenfa(M[i], N[i]);
			System.out.printf("%d\n",K[i]);
		}
		return 0;
	}
}

