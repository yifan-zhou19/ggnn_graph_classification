package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		int s;
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
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((a[i][j] != 0) && (a[i][j + 1] == 0))
				{
					b = i;
					c = j + 1;
				}
				if ((a[i][j] == 0) && (a[i][j + 1] != 0))
				{
					d = j;
					i = n;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if ((a[i][j] == 0) && (a[i + 1][j] != 0))
				{
					e = i;
					j = n;
				}
			}
		}
		s = (d - c + 1) * (e - b + 1) - (4 + (d - c - 1) * 2 + (e - b - 1) * 2);
		System.out.printf("%d",s);
		return 0;
	}
}

