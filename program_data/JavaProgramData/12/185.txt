package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][16];
		int[] b = new int[20];
		int i = 0;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][0] = Integer.parseInt(tempVar);
		}
		i++;
		while (a[k][0] != -1) //input the chunk of data
		{
			do
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[k][i] = Integer.parseInt(tempVar2);
				}
				i++;
			} while (a[k][i - 1] != 0);
			k++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k][0] = Integer.parseInt(tempVar3);
			}
			i = 1;
		}

		for (k = 0;a[k][0] != -1;k++)
		{
			for (i = 0;a[k][i] != 0;i++)
			{
				for (j = i + 1;a[k][j] != 0;j++)
				{
					if ((a[k][j] / a[k][i] == 2 && a[k][j] % a[k][i] == 0) || (a[k][i] / a[k][j] == 2 && a[k][i] % a[k][j] == 0)) //judge double numbers
					{
						b[k]++;
					}
				}
			}
			System.out.printf("%d\n",b[k]);
		}
		return 0;
	}

}

