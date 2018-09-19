package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int p = 0;
		int[][] a = new int[10000][16];
		for (j = 0;j < 10000;j++)
		{
		for (i = 0;i < 16;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j][i] = Integer.parseInt(tempVar);
			}
			if ((a[j][i] == 0) || (a[j][i] == -1))
			{
				break;
			}
		}
		if (a[j][0] == -1)
		{
			break;
		}
		}
		for (m = 0;m < j;m++)
		{
		i = 0;
		while (a[m][i] != 0)
		{
			n = 0;
			while (a[m][n] != 0)
			{
				if (a[m][i] == 2 * a[m][n])
				{
					p++;
				}
				n++;
			}
			i++;
		}
		System.out.printf("%d\n",p);
		p = 0;
		}
	}
}

