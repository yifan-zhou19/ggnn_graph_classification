package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] x, int n) //???? ?n?????
	{
		int i;
		int j;
		int y;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (x[j] > x[j + 1])
				{
					y = x[j];
					x[j] = x[j + 1];
					x[j + 1] = y;
				}
			}
		}
	}

	public static int Main()
	{
	   int[][] x = new int[5][5];
	   int[] a = new int[5];
	   int[] b = new int[5];
	   int i;
	   int j;
	   int t1;
	   int t2;
	   int sign = 0;

	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   x[i][j] = Integer.parseInt(tempVar);
			   }
		   }
	   }

	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			   a[j] = x[i][j];
		   }
		   bubble(a, 5);
		   for (j = 0;j < 5;j++)
		   {
			   if (a[4] == x[i][j])
			   {
				   t1 = j;
			   }
		   }

		   for (j = 0;j < 5;j++)
		   {
			   b[j] = x[j][t1];
		   }
		   bubble(b, 5);
		   for (j = 0;j < 5;j++)
		   {
			   if (b[0] == x[j][t1])
			   {
				   t2 = j;
			   }
		   }
		   if (a[4] == b[0])
		   {
						 System.out.printf("%d %d %d",t2 + 1,t1 + 1,a[4]);
						  sign = 1;
		   }
	   }

	   if (sign == 0)
	   {
	   System.out.print("not found");
	   }


	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   x[i][j] = Integer.parseInt(tempVar2);
	   }
	   return 0;

	}

}

