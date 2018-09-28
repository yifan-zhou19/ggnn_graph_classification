package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][300];
		int[] b = new int[100];
		int[] c = new int[100];
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			i++;
		} while (b[i - 1] != 0 && c[i - 1] != 0);
		m = i - 1;
		for (i = 0;i < m;i++)
		{
			for (j = 1;j <= b[i];j++)
			{
				a[i][j - 1] = j;
			}
		}
		for (i = 0;i < m;i++)
		{
			n = b[i];
			for (j = 0,k = 0;n > 1;j++)
			{
				if (j >= b[i])
				{
					j = j - b[i];
				}
				if (a[i][j] != 0)
				{
					k++;
				}
				if (k == c[i])
				{
					a[i][j] = 0;
					n = n - 1;
					k = 0;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < b[i];j++)
			{
				if (a[i][j] != 0)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}

	}
}

