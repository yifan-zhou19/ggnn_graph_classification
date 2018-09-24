package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[][] a = new int[100][16];
	int i;
	int j;
	int k;
	int l;
	int m;
	int[] s = new int[100];
	for (i = 0;i < 100;i++)
	{
		 for (j = 0;j < 16;j++)
		 {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		if (a[i][j] == 0 || a[i][j] == -1)
		{
			break;
		}
		 }
		if (a[i][j] == -1)
		{
			break;
		}
	}
	for (k = 0;k < i;k++)
	{
			for (l = 0;l < 16;l++)
			{
			for (m = 0;m < 16;m++)
			{
				if ((a[k][m] != 0) && (a[k][l] / a[k][m] == 2) && (a[k][l] % a[k][m] == 0))
				{
					s[k]++;
				}
			}
			}
	}
	for (k = 0;k < i;k++)
	{
	  System.out.printf("%d\n",s[k]);
	}
	}


}

