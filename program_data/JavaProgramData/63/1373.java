package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a2 = Integer.parseInt(tempVar2);
		}
		for (int n = 0;n < a1;n++)
		{
			for (int i = 0;i < a2;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[n][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		for (int n = 0;n < b1;n++)
		{
			for (int i = 0;i < b2;i++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[n][i] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (int n = 0;n < a1;n++)
		{
			for (int i = 0;i < b2;i++)
			{
				for (int j = 0;j < a2;j++)
				{
					c[n][i] += a[n][j] * b[j][i];
				}
			}
		}
		for (int n = 0;n < a1;n++)
		{
			System.out.printf("%d",c[n][0]);
			if (b2 == 1)
			{
				System.out.print("\n");
			}
			for (int i = 1;i < b2;i++)
			{
				System.out.printf(" %d",c[n][i]);
				if (i == b2 - 1)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

