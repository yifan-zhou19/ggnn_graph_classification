package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int result;
		int[] sz = new int[10000];
			sz[0] = 1,sz[1] = 1;
		for (int r = 2;r < 10000;r++)
		{
			sz[r] = sz[r - 1] + sz[r - 2];
		}
		for (int y = 0;y < 10000;y++)
		{
			if (n == y + 1)
			{
				result = sz[y];
				break;
			}

		}
		return result;
	}
	public static int Main()
	{
		int n;
		int[] bb = new int[20];
		int[] sl = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bb[i] = Integer.parseInt(tempVar2);
			}
			sl[i] = F(bb[i]);
			System.out.printf("%d\n",sl[i]);
		}
		return 0;
	}


}

