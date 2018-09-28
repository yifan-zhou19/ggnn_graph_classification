package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] fuck = new int[5][5];
		int i;
		int j;
		int k;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					fuck[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (m >= 5 || n >= 5)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				k = fuck[n][i];
				fuck[n][i] = fuck[m][i];
				fuck[m][i] = k;
			}
			for (i = 0;i < 4;i++)
			{
				System.out.printf("%d %d %d %d %d\n",fuck[i][0],fuck[i][1],fuck[i][2],fuck[i][3],fuck[i][4]);
			}
			System.out.printf("%d %d %d %d %d",fuck[4][0],fuck[4][1],fuck[4][2],fuck[4][3],fuck[4][4]);
		}
		return 0;
	}


}

