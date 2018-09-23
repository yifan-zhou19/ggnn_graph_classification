package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[100][100];
		int n;
		int s = 0;
		int S;
		int h1 = 0;
		int h2 = 0;
		int l1 = 0;
		int l2 = 0;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0 && s == 0)
				{
					l1 = i + 1;
					h1 = j + 1;
					s = 1;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (a[i][j] == 0 && s != 0)
				{
					l2 = i;
					h2 = j;
					s = 0;
				}
			}
		}
		S = (l2 - l1) * (h2 - h1);
		System.out.printf("%d\n",S);
		return 0;
	}

}

