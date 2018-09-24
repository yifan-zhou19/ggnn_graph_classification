package <missing>;

public class GlobalMembers
{
	public static int[][] A = new int[1000][1000];
	public static int[][] B = new int[1000][1000];
	public static int[][] C = new int[1000][1000];
	public static int hang;
	public static int lie;
	public static int tong;
	public static int q;
	public static int i;
	public static int j;
	public static int Main()
	{
		//??
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			tong = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hang;i++)
		{
			for (q = 0;q < tong;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i][q] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			tong = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			lie = Integer.parseInt(tempVar5);
		}
		for (q = 0;q < tong;q++)
		{
			for (j = 0;j < lie;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					B[q][j] = Integer.parseInt(tempVar6);
				}
			}
		}

		//??
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				for (q = 0;q < tong;q++)
				{
					C[i][j] = C[i][j] + A[i][q] * B[q][j];
				}
			}
		}

		//??
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",C[i][j]);
				}
				else
				{
					System.out.printf(" %d",C[i][j]);
				}
			}
			System.out.print("\n");
		}

	}
}

