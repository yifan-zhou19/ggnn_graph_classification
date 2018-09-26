package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int[] t = new int[5];
		int[] m = new int[5];
		int tag = 0;
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
		for (i = 0;i < 5;i++)
		{
		t[i] = a[i][0];
		}
		for (j = 0;j < 5;j++)
		{
		m[j] = a[0][j];
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (t[i] < a[i][j])
				{
					t[i] = a[i][j];
				}
				if (m[i] > a[j][i])
				{
					m[i] = a[j][i];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			if (a[i][j] == t[i] && a[i][j] == m[j])
			{
				System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
				tag++;
			}
		}
		}
		if (tag == 0)
		{
		System.out.print("not found\n");
		}
		return 0;
	}

}

