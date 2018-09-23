package <missing>;

public class GlobalMembers
{
	public static int fen(int x, int y)
	{
		int j;
		int k;
		int result = 1;
		if (x < y)
		{
			return 0;
		}
		for (j = y;j < x;j++)
		{
			if (x % j == 0)
			{
			result += fen(x / j, j);
			}
		}
		return result;
	}

	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[500];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fen(m[i], 2));
		}
		return 0;
	}
}

