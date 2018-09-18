package <missing>;

public class GlobalMembers
{
	public static int[][] m = new int[1000][1000];
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int f;
		int i;
		int j;
		int e = 0;
		int n;
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
					m[i][j] = Integer.parseInt(tempVar2);
				}
			}
			System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (m[i][j] == 0)
				{
					a = i;
					b = j;
					e = 1;
					break;
				}

			}
			if (e == 1)
			{
				break;
			}
		}
		for (j = b;j < n;j++)
		{
			if (m[a][j] != 0)
			{
				c = j - 1;
				break;
			}
		}
		for (i = a;i < n;i++)
		{
			if (m[i][b] != 0)
			{
				d = i - 1;
				break;
			}
		}
		f = (c - b - 1) * (d - a - 1);
		System.out.printf("%d",f);
		return 0;
	}
}

