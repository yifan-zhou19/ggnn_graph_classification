package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] zu = new int[5][5];
		int n;
		int m;
		int[][] h = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					zu[i][j] = Integer.parseInt(tempVar);
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
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				h[0][i] = zu[m][i];
				zu[m][i] = zu[n][i];
				zu[n][i] = h[0][i];
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",zu[i][0]);
				for (j = 1;j < 5;j++)
				{
				System.out.printf(" %d",zu[i][j]);

				}
				System.out.print("\n");
			}
		}


		return 0;
	}



}

