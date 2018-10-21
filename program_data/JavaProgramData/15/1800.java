package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[][] a = new int[1000][1000];
		int[] m = new int[2];
		int[] n = new int[2];
		int S;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		f = -1;
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (a[i][j] == 0 && f == -1)
				{
					m[0] = i + 1;
					n[0] = j + 1;
					f = 1;
				}
				if (a[i][j] == 0)
				{
					m[1] = i - 1;
					n[1] = j - 1;
				}
			}
		}
		S = (m[1] - m[0] + 1) * (n[1] - n[0] + 1);
		System.out.printf("%d\n",S);
		return 0;
	}

}

