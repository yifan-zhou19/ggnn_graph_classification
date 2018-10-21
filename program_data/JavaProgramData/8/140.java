package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 void f(int a[2][200],int m,int n);
	 int i;
	 int j;
	 int[][] a = new int[2][200];
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0,j = 0;j < m;j++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[0][j] = Integer.parseInt(tempVar3);
	  }
	 }
	 for (i = 1,j = 0;j < n;j++)
	 {
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  a[1][j] = Integer.parseInt(tempVar4);
	  }
	 }
	 f(a, m, n);
	 for (i = 0,j = 0;j < m;j++)
	 {
	  System.out.printf("%d ",a[0][j]);
	 }
	 for (i = 1,j = 0;j < n - 1;j++)
	 {
	  System.out.printf("%d ",a[1][j]);
	 }
	 System.out.printf("%d",a[1][n - 1]);
	}
	public static void f(int[][] a, int m, int n)
	{
	 int i;
	 int j;
	 int t;
	 for (i = 0;i < m - 1;i++)
	 {
	  for (j = i + 1;j < m;j++)
	  {
	   if (a[0][j] < a[0][i])
	   {
		   t = a[0][j];
		   a[0][j] = a[0][i];
		   a[0][i] = t;
	   }
	  }
	 }

	 for (i = 0;i < n - 1;i++)
	 {
	  for (j = i + 1;j < n;j++)
	  {
	   if (a[1][j] < a[1][i])
	   {
		   t = a[1][j];
		   a[1][j] = a[1][i];
		   a[1][i] = t;
	   }
	  }
	 }

	}

}

