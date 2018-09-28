package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int p;
		int q;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (p = 0;p < x1;p++)
		{
			for (q = 0;q < y1;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[p][q] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (p = 0;p < x2;p++)
		{
			for (q = 0;q < y2;q++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[p][q] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (p = 0;p < x1;p++)
		{
			for (q = 0;q < y2;q++)
			{
				for (t = 0;t < y1;t++)
				{
					c[p][q] += a[p][t] * b[t][q];
				}
			}
		}
		for (p = 0;p < x1;p++)
		{
			t = 0;
			for (q = 0;q < y2;q++)
			{
				if (t != 0)
				{
					System.out.print(" ");
				}
				System.out.printf("%d",c[p][q]);
				t = 1;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

