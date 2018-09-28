package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int max;
	 int k;
	 int maxa;
	 int m;
	 int n;
	 int t;
	 int s = 0;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 int[][] a = new int[8][8];
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	  System.out.print("\n");
	 }
	 for (i = 0;i < m;i++)
	 {
		  t = 0;

	  max = a[i][0];
	maxa = 0;
	  for (j = 0;j < n;j++)
	  {
		  if (max < a[i][j])
		  {
		max = a[i][j];
		maxa = j;
		  }
	  }
	  for (k = 0;k < m;k++)
	  {
	   if (max > a[k][maxa])
	   {
		   t++;
	   }
	  }
	  if (t == 0)
	  {
	   System.out.printf("%d+%d\n",i,maxa);
	  s++;
	  }
	 }
	 if (s == 0)
	 {
	  System.out.print("No");
	 }
	 return 0;
	}


}

