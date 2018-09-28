package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int j;
		int k;
		int b;
		int c;
		int[][] a = new int[8][8];
		int max = -1;
		int min = 1000;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					c = j;
				}
			}
			for (k = 0;k < h;k++)
			{
				  if (a[k][c] < min)
				  {
					  min = a[k][c];
					  b = k;
				  }
			}

				  if (min == max)
				  {
					System.out.printf("%d+%d",b,c);
					m++;
				  }


		}
		if (m == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

