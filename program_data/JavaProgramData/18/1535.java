package <missing>;

public class GlobalMembers
{
	public static void rowset(int[][] a, int n)
	{
		 int i;
		 int j;
		 int min;
		 for (i = 0;i <= n - 1;i++)
		 {
			 min = a[i][0];
			 for (j = 0;j <= n - 1;j++)
			 {
				 if (min > a[i][j])
				 {
				 min = a[i][j];
				 }
			 }
			 for (j = 0;j <= n - 1;j++)
			 {
				 a[i][j] = a[i][j] - min;
			 }
		 }
	}

	public static void lineset(int[][] a, int n)
	{
		 int i;
		 int j;
		 int min;
		 for (i = 0;i <= n - 1;i++)
		 {
			 min = a[0][i];
			 for (j = 0;j <= n - 1;j++)
			 {
				 if (min > a[j][i])
				 {
				 min = a[j][i];
				 }
			 }
			 for (j = 0;j <= n - 1;j++)
			 {
				 a[j][i] = a[j][i] - min;
			 }
		 }
	}

	public static void form(int[][] a, int n)
	{
		 int i;
		 int j;
		 int k;
		 for (i = 0;i <= n - 1;i++)
		 {
			 for (j = 2;j <= n - 1;j++)
			 {
				 a[i][j - 1] = a[i][j];
			 }
		 }
		 for (j = 0;j <= n - 2;j++)
		 {
			 for (i = 2;i <= n - 1;i++)
			 {
				 a[i - 1][j] = a[i][j];
			 }
		 }
	}

	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int flag;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[][] a = new int[n][105];
	  int sum;
	  flag = n;
	  for (i = 0;i <= n - 1;i++)
	  {
		  sum = 0;
		  for (j = 0;j <= n - 1;j++)
		  {
			  for (k = 0;k <= n - 1;k++)
			  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[j] + k = Integer.parseInt(tempVar2);
				  }
			  }
		  }
		  flag = n;
		  while (flag >= 2)
		  {
		   rowset(a, flag);
		   lineset(a, flag);
		   sum += a[1][1];
		   form(a, flag);
		   flag--;
		  }
		  System.out.printf("%d",sum);
		   (i <= n - 2)?System.out.print("\n"):printf("");
	  }
	}


}

