package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int flag;
		int l = 0;
		int p;
		int k = 0;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				if (a[i][l] < a[i][j])
				{
					l = j;
				}
			}
			for (p = 0,flag = 0;p <= 4;p++)
			{
				if (p == i)
				{
					continue;
				}
				if (a[i][l] > a[p][l])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				k = 1;
				System.out.printf("%d %d %d",i + 1,l + 1,a[i][l]);
			}
		}
		if (flag == 1 && k == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

