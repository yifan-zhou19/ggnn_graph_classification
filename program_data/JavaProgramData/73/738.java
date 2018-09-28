package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] mi = new int[5];
		int i;
		int j;
		int k;
		int m;
		int n;
		int x;
		int y;
		k = 0;
		m = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			m = 0;
			for (i = 0;i < 5;i++)
			{
			if (m < a[j][i])
			{
			m = a[j][i];
			}
			}
			max[j] = m;
		}
		for (j = 0;j < 5;j++)
		{
			n = a[0][j];
			for (i = 0;i < 5;i++)
			{

			if (n > a[i][j])
			{
			n = a[i][j];
			}
			}
			mi[j] = n;
		}



		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == max[i] && a[i][j] == mi[j])
				{

				System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				k++;
				}
			}
		}
		if (k == 0)
		{
		System.out.print("not found");
		}


	}
}

