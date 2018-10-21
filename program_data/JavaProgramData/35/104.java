package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[][] a = new int[9][9];
	 int i;
	 int j;
	 int k;
	 int n;
	 int m;
	 int max;
	 int tmd;
	 max = 0;
	 tmd = 0;
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
	 for (i = 0;i <= m - 1;i++)
	 {
	 for (j = 0;j <= n - 1;j++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i][j] = Integer.parseInt(tempVar3);
	 }
	 }
	 }
	 for (i = 0;i <= m - 1;i++)
	 {
		 max = 0;
		 for (j = 0;j <= n - 2;j++)
		 {
	 if (a[i][j] < a[i][j + 1])
	 {
		 max = j + 1;
	 }
		 }
	  for (k = 0;k <= m - 1;k++)
	  {
		   if (a[i][max] > a[k][max])
		   {
			   tmd = 0;
			   break;
		   }
	  else if (k == m - 1)
	  {
		  tmd = 1;
		  break;
	  }
	  }
	  if (tmd == 1)
	  {
		  break;
	  }
	 }
	 if (tmd == 1)
	 {
		 System.out.printf("%d+%d\n",i,max);
	 }
	 else
	 {
		 System.out.print("No\n");
	 }
	}

}

