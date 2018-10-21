package <missing>;

public class GlobalMembers
{
	public static int f(int[][] a, int m, int n)
	{
	  int i;
	  int temp;
	  if (n > 4 || m > 4)
	  {
		  return 0;
	  }
	  else
	  {
	  for (i = 0;i < 5;i++)
	  {
		temp = a[m][i];
		a[m][i] = a[n][i];
		a[n][i] = temp;
	  }
	  }
	  return 1;
	}
	 public static int Main()
	 {
		 int m;
		 int n;
		 int[][] a = new int[5][5];
		 int k;
		 int i;
		 int j;
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
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
		 k = f(a, m, n);
		 if (k == 0)
		 {
		 System.out.print("error\n");
		 }
		 if (k == 1)
		 {
		  for (i = 0;i < 5;i++)
		  {
		   for (j = 0;j < 5;j++)
		   {
		   if (j < 4)
		   {
		   System.out.printf("%d ",a[i][j]);
		   }
		   if (j == 4)
		   {
		   System.out.printf("%d\n",a[i][j]);
		   }
		   }
		  }
		 }
		   return 0;
	 }

}

