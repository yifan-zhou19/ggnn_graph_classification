package <missing>;

public class GlobalMembers
{
	public static int check(int[] p, int n, int m)
	{
		int i;
		int t;
		if ((n >= 0) && (n <= 4) && (m >= 0) && (m <= 4))
		{
			for (i = 0;i <= 4;i++)
			{
				t = (p[n] + i);
				*(p[n] + i) = *(p[m] + i);
				*(p[m] + i) = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		int j;
		int k;
		int c;
		int[][] a = new int[5][5];
		for (j = 0;j < 5;j++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		c = check(a, x, y);
		if (c == 1)
		{
			for (j = 0;j < 5;j++)
			{
			   for (k = 0;k < 4;k++)
			   {
				   System.out.printf("%d ",a[j][k]);
			   }
			System.out.printf("%d",a[j][4]);
			System.out.print("\n");
			}
		}
		else if (c == 0)
		{
			System.out.print("error");
		}

		return 0;
	}









}

