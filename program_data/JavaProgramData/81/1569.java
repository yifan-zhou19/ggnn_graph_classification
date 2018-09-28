package <missing>;

public class GlobalMembers
{
	public static void huanhang(int[][] array, int x, int y)
	{
	  int j;
	  int[][] a = new int[1][5];
	  for (j = 0;j < 5;j++)
	  {
	   a[0][j] = array[y][j];
	   array[y][j] = array[x][j];
	   array[x][j] = a[0][j];
	  }
	}
	public static int panbie(int p,int q)
	{
	 if (p >= 0 && p < 5 && q >= 0 && q < 5)
	 {
	  return (1);
	 }
	 else
	 {
	  return (0);
	 }
	}
	 public static void Main()
	 {
	  int i;
	  int j;
	  int n;
	  int m;
	  int[][] b = new int[5][5];
	  for (i = 0;i < 5;i++)
	  {
	  for (j = 0;j < 5;j++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   b[i][j] = Integer.parseInt(tempVar);
	   }
	  }
	  }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   m = Integer.parseInt(tempVar3);
	   }
	  if (panbie(n, m) != 0)
	  {
		huanhang(b, n, m);
	   for (i = 0;i < 5;i++)
	   {
		 System.out.printf("%d",b[i][0]);
		 for (j = 1;j < 5;j++)
		 {
		 System.out.printf(" %d",b[i][j]);
		 }
		 System.out.print("\n");
	   }
	  }
	  else
	  {
	   System.out.print("error");
	  }
	  System.out.print("\n");
	 }
}

