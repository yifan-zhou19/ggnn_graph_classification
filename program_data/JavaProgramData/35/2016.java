package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int max;
	public static int a;
	public static int d;
	public static int c;
	 public static int m;
	 public static int n;
	 public static int good;
	 public static int[][] sz = new int[8][8];
	public static int Main()
	{
	 good = 0;
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
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n - 1;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  sz[i][n - 1] = Integer.parseInt(tempVar4);
	  }
	 }
	 for (i = 0;i < m;i++)
	 {
	  max = sz[i][0];
	  for (j = 0;j < n;j++)
	  {
	   if (sz[i][j] > max)
	   {
		max = sz[i][j];
		d = j;
		c = i;
	   }
	  }
	  for (a = 0;a < m;a++)
	  {
	   if (max > sz[a][d])
	   {
		   good++;
		   break;
	   }
	  }
	  if (good == 0)
	  {
		  System.out.printf("%d+%d",c,d);
		  break;
	  }
	 }
	 if (good != 0)
	 {
		  System.out.print("No");
	 }
		return 0;
	}
}

