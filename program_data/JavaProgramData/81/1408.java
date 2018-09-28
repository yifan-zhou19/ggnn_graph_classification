package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int exchange = new int(int row[5][5],int n,int m);
		int[][] jz = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					jz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (exchange(jz, n, m) == 0)
		{
			System.out.print("error\n");
		}
		return 0;
	}
	public static int exchange(int[][] row, int n, int m)
	{
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			return 0;
		}
		else
		{
			int i;
			int j;
			int between;
			for (i = 0;i < 5;i++)
			{
				between = row[n][i];
				row[n][i] = row[m][i];
				row[m][i] = between;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",row[i][j]);
				}
				System.out.printf("%d\n",row[i][4]);
			}
			return (1);
		}
	}





}

