package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int l;
		int m;
		int t;
		int[][] a = new int[100][100];
		int[] c = new int[100];
		for (i = 1;;i++)
		{
			j = 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			if (a[i][j] == -1)
			{
				break;
			}
			for (j = 2;j < 100;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					break;
				}
				for (l = j;l >= 1;l--)
				{
					if (a[i][j] == 2 * a[i][l] || 2 * a[i][j] == a[i][l])
					{
						c[i]++;
					}
					else
					{
						continue;
					}
				}
			}
			k++;
		}
		for (m = 1;m <= k;m++)
		{
			System.out.printf("%d\n",c[m]);
		}
	}
}

