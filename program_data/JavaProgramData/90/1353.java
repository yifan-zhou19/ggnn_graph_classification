package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[31][31];
		  int t;
		  int i;
		  int j;
		  int m;
		  int n;
		  for (i = 0;i <= 30;i++)
		  {
			  a[i][0] = 0;
		  }
		  for (i = 1;i <= 30;i++)
		  {
			  a[0][i] = 1;
		  }
		  for (i = 1;i <= 30;i++)
		  {
			  for (j = 1;j <= 30;j++)
			  {
				  if (i >= j)
				  {
					  a[i][j] = a[i][j - 1] + a[i - j][j];
				  }
				  else
				  {
					  a[i][j] = a[i][i];
				  }
			  }
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= t;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  n = Integer.parseInt(tempVar3);
			  }
			  System.out.printf("%d\n",a[m][n]);
		  }
		  System.in.read();
		  System.in.read();
	}
}

