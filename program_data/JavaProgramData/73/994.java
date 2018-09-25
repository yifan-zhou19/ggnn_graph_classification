package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int[][] b = new int[5][5];
	int[][] c = new int[5][5];
	int[] max = new int[5];
	int[] min = new int[5];
	int i;
	int j;
	int i1;
	int i2;
	int i3;
	int i4;
	int i5;
	int i6;
	int i7;
	int i8;
	int m;
	int n;
	int p = 0;
	int prin;
	for (i = 0;i <= 4;i++)
	{
		for (j = 0;j <= 4;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			b[i][j] = a[i][j];
			c[i][j] = a[i][j];
		}
	}
	 for (i1 = 0;i1 <= 4;i1++)
	 {
	   for (i2 = 1;i2 <= 4;i2++)
	   {
	   for (i3 = 0;i3 <= 3;i3++)
	   {
		 if (b[i1][i3] < b[i1][i3 + 1])
		 {
			   m = b[i1][i3 + 1];
			b[i1][i3 + 1] = b[i1][i3];
			b[i1][i3] = m;
		 }
	   }
	   }
	 max[i1] = b[i1][0];
	 }
	  for (i4 = 0;i4 <= 4;i4++)
	  {
	   for (i5 = 1;i5 <= 4;i5++)
	   {
	   for (i6 = 0;i6 <= 3;i6++)
	   {
		 if (c[i6][i4] > c[i6 + 1][i4])
		 {
			   n = c[i6 + 1][i4];
			c[i6 + 1][i4] = c[i6][i4];
			c[i6][i4] = n;
		 }
	   }
	   }
	 min[i4] = c[0][i4];
	  }
	   for (i7 = 0;i7 <= 4;i7++)
	   {
	  for (i8 = 0;i8 <= 4;i8++)
	  {
	   if ((max[i7] == min[i8]))
	   {
		   prin = max[i7];
		   i7 = i7 + 1;
		   i8 = i8 + 1;
		   System.out.printf("%d %d %d\n",i7,i8,prin);
		   p = p + 1;
	   }
	  }
	   }
	 if (p == 0)
	 {
	 System.out.print("not found");
	 }
	}


}

