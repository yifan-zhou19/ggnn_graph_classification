package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[1000][1000];
		int i;
		int j;
		int S;
		int[] a = new int[2];
		int[] b = new int[2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s[i][j] == 0 && s[i + 1][j] == 0 && s[i][j + 1] == 0)
				{
					a[0] = i;
					b[0] = j;
				}
				if (s[i][j] == 0 && s[i - 1][j] == 0 && s[i][j - 1] == 0)
				{
					a[1] = i;
					b[1] = j;
				}
			}
		}
		S = (a[1] - a[0] - 1) * (b[1] - b[0] - 1);
		System.out.printf("%d",S);
		return 0;
	}
}

