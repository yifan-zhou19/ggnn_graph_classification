package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int h;
		int s;
		int i;
		int j;
		int m;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		m = h * s;
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < s;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;;i++)
		{
			for (j = i;j < s - i;j++)
			{
				System.out.printf("%d\n",a[i][j]);
				z++;
			}
			if (z == m)
			{
				break;
			}
			for (j = i + 1;j < h - i;j++)
			{
				System.out.printf("%d\n",a[j][s - 1 - i]);
				z++;
			}
			if (z == m)
			{
				break;
			}
			for (j = s - i - 2;j >= i;j--)
			{
				System.out.printf("%d\n",a[h - i - 1][j]);
				z++;
			}
			if (z == m)
			{
				break;
			}
			for (j = h - i - 2;j > i;j--)
			{
				System.out.printf("%d\n",a[j][i]);
				z++;
			}
			if (z == m)
			{
				break;
			}
		}
	}
}

