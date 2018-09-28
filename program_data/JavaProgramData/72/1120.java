package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[A][A];
		int k = 0;
		int e;
		int d;
		int i;
		int a;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < A;i++)
		{
			for (a = 0;a < A;a++)
			{
				s[i][a] = 0;
			}
		}
		for (e = 1;e < m + 1;e++)
		{
			for (d = 1;d < n + 1;d++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[e][d] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (e = 1;e < m + 1;e++)
		{
			for (d = 1;d < n + 1;d++)
			{
				if (s[e][d] >= s[e+1][d] != 0 && s[e][d] >= s[e-1][d] != 0 && s[e][d] >= s[e][d + 1] != 0 && s[e][d] >= s[e][d - 1])
				{
				System.out.printf("%d %d\n",e-1,d - 1);
				}
			}
		}
		return 0;
	}

}

