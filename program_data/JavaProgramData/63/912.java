package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][] Main_c = new int[100][100];
	public static void Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int s;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int c[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y1 - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i <= x2 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				for (s = 0;s <= x2 - 1;s++)
				{
					Main_c[i][j] = a[i][s] * b[s][j] + Main_c[i][j];
				}
			}
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			System.out.printf("%d",Main_c[i][0]);
			for (j = 1;j <= y2 - 1;j++)
			{
				System.out.printf(" %d",Main_c[i][j]);
			}
			System.out.print("\n");
		}
	}
}

