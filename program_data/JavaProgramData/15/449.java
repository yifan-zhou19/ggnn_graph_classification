package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int o;
		int p;
		int q = 0;
		int c;
		int d;
		int[][] a = new int[100][100];
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
				if (a[i][j] == 0 && a[i - 1][j] == 255 && a[i][j - 1] == 255)
				{
					x = i;
					y = j;
				}
				else if (a[i][j] == 0 && a[i][j + 1] == 255 && a[i + 1][j] == 255)
				{
					o = i;
					p = j;
				}
			}
		}
				c = o - x - 1;
				d = p - y - 1;
				q = c * d;
		System.out.printf("%d\n",q);
	}


}

