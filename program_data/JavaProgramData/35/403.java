package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int t = 0;
	 int s;
	 int z = 0;
	 int w = 0;
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(", ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 int[][] a = new int[8][8];
	 for (i = 0;i < m;i++)
	 {
	   for (j = 0;j < n - 1;j++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
	   }
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i][n - 1] = Integer.parseInt(tempVar4);
		}

	 }
	  for (i = 0;i < m;i++)
	  {
	   s = a[i][0];
	   k = i;
			   for (j = 0;j < n;j++)
			   {
	   if (a[i][j] > s)
	   {
		s = a[i][j];
		k = i;
		t = j;
	   }
			   }
		 for (i = 0;i < m;i++)
		 {
		  if (a[i][t] < s)
		  {
			  w = w + 1;
		  }
		 }
		  if (w == 0)
		  {
			  System.out.printf("%d+%d",k,t);
		  z = z + 1;
		  }
		  else
		  {
			  continue;
		  }

	  }
	 if (z == 0)
	 {
		 System.out.print("No");
	 }
		return 0;
	}
}

