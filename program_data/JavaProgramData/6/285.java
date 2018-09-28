package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
		  int l;
		  int m;
		  int n;
		  int[][] a = new int[100][100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < k;i++)
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
			  int add = 0;
			  for (j = 0;j < m;j++)
			  {
				 for (l = 0;l < n;l++)
				 {
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   a[j][l] = Integer.parseInt(tempVar4);
				   }
				 }
			  }
			  for (l = 0;l < n;l++)
			  {
				   add += (a[0][l] + a[m - 1][l]);
			  }
			  for (l = 1;l < m - 1;l++)
			  {
				   add += (a[l][0] + a[l][n - 1]);
			  }
			  System.out.printf("%d\n",add);
			  for (j = 0;j < 100;j++)
			  {
				  for (l = 0;l < 100;l++)
				  {
					a[j][l] = 0;
				  }
			  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

