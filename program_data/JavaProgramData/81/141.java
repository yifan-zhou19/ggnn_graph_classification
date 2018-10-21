package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] jz = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int[] x = new int[5];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n < 5 && m < 5)
		{
			for (j = 0;j < 5;j++)
			{
				for (j = 0;j < 5;j++)
				{
				x[j] = jz[n][j];
				jz[n][j] = jz[m][j];
				jz[m][j] = x[j];
				}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",jz[i][j]);
				}
				System.out.printf("%d\n",jz[i][4]);
			}
			}
		}
		 else
		 {
			System.out.print("error");
		 }
		return 0;
	}


}

