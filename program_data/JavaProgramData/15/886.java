package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int m = 0;
		int i1;
		int i2;
		int j1;
		int j2;
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
				if (a[i][j] == 0)
				{
					m++,i2 = i,j2 = j;
				}
				if (m == 1)
				{
					i1 = i,j1 = j;
				}
			}
		}
		int num = (i2 - i1 - 1) * (j2 - j1 - 1);
		System.out.printf("%d",num);
		return 0;
	}



}

