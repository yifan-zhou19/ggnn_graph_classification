package <missing>;

public class GlobalMembers
{
	public static void exchange(int[] p, int x, int y)
	{
		int e;
		int i;
		int k;
		if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
		{
			for (i = 0;i <= 4;i++)
			{
				e = (p[x] + i);
				*(p[x] + i) = *(p[y] + i);
				*(p[y] + i) = e;
			}
			for (i = 0;i <= 4;i++)
			{
				for (k = 0;k <= 3;k++)
				{
					System.out.printf("%d ",*(p[i] + k));
				}
				System.out.printf("%d\n",*(p[i] + 4));
			}
		}
		else
		{
			System.out.print("error");
		}
	}
	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int[][] square = new int[5][5];
		for (k = 0;k <= 4;k++)
		{
			for (i = 0;i <= 4;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(square[k][i]) = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		exchange(square, m, n);
		return 0;
	}

}

