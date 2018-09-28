package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int COUNT = 0;
		int[] m = new int[300];
		int[] n = new int[300];
		int[][] STAT = new int[300][300];
		int[] sum = new int[300];
		int[] SUM = new int[300];
		/*??m,n*/
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			COUNT++;
			sum[i] = 0;
			SUM[i] = n[i];
			if (m[i] == 0 && n[i] == 0)
			{
				break;
			}
		}

		for (i = 0;i < COUNT - 1;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				STAT[i][j] = 1; //???STAT;
			}
			while (SUM[i] > 1)
			{
				for (j = 0;j < n[i];j++)
				{
					sum[i] += STAT[i][j];
					if (sum[i] == m[i])
					{
					   sum[i] = 0;
					   STAT[i][j] = 0;
					   SUM[i] = SUM[i] - 1; //??m[i]???;
					}
					if (SUM[i] == 1)
					{
						break;
					}
				}
			}
			for (j = 0;j < n[i];j++)
			{
				if (STAT[i][j] == 1)
				{
					System.out.printf("%d\n",j + 1); //??;
				}
			}
		}
		return 0;
	}
}

