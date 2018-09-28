package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int n;
		int m;
		int k;
		int y;
		int f;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < m;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
		 y = 0;
		 f = 1;
	  for (j = 0;j < m;j++)
	  {
	   if (a[i][y] < a[i][j])
	   {
		   y = j;
	   }
	  }
	  for (k = 0;k < n;k++)
	  {
	   if (a[i][y] > a[k][y])
	   {
		   f = 0;
		break;
	   }
	  }
	  if (f == 1)
	  {
		  System.out.printf("%d+%d\n",i,y);
	   break;
	  }
	 }
	 if (f == 0)
	 {
		 System.out.print("No\n");
	 }
	}
}

