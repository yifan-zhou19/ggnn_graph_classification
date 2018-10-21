package <missing>;

public class GlobalMembers
{
	public static int p(int[][] x, int y, int z)
	{
		int u;
		int i;
		int temp;
		if (y >= 0 && y <= 4 && z >= 0 && z <= 4)
		{
			u = 1;
			for (i = 0;i < 5;i++)
			{
				temp = x[y][i];
				x[y][i] = x[z][i];
				x[z][i] = temp;
			}
		}
		else
		{
			u = 0;
		}
		return u;
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int b;
		int c;
		int i;
		int j;
		int d;
		int w = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			d = p(a, b, c);
			if (d == 1)
			{
			for (i = 0;i < 5;i++)
			{
			   for (j = 0;j < 5;j++)
			   {
				   if (j == 4)
				   {
					   System.out.printf("%d",a[i][j]);
				   }
				   else
				   {
				   System.out.printf("%d ",a[i][j]);
				   }
				   w++;
				   if (w == 5)
				   {
					   System.out.print("\n");
				   }
				   if (w == 10)
				   {
					   System.out.print("\n");
				   }
				   if (w == 15)
				   {
					   System.out.print("\n");
				   }
				   if (w == 20)
				   {
					   System.out.print("\n");
				   }
			   }
			}
			}
			else
			{
				System.out.print("error");
			}
	}
}

