package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			c = sz[i][0] - sz[i][1];
			if (c == -1 || c == 2)
			{
				a++;
			}
			if (c == 1 || c == -2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}

		return 0;
	}


}

