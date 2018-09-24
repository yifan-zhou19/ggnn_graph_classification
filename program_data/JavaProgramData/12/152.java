package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int[][] a = new int[100][100];
		int[] s = new int[1000];
		int[] b = new int[100];
		int k = 0;
		for (i = 0;i < 1000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
			if (s[i] == -1)
			{
				break;
			}
		}
		for (i = 0;s[i] != -1;i++)
		{
			if (s[i] != 0)
			{
			   a[k][j] = s[i];
			   j++;
			}
			else
			{
				a[k][j] = 0;
				j = 0;
				k++;
			}
		}
		a[k][0] = -1;
		for (i = 0;a[i][0] != -1;i++)
		{
			for (j = 0;a[i][j] != 0;j++)
			{
				for (k = 0;a[i][k] != 0;k++)
				{
					if (a[i][j] == 2 * a[i][k])
					{
						b[i]++;
					}
				}
			}
			System.out.printf("%d\n",b[i]);
		}
	}


}

