package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[1000][1000];
		  int n;
		  int m;
		  int i;
		  int p;
		  int q;
		  int k;
		  int j;
		  int l;
		  int b;
		  for (i = 1;;i++)
		  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  n = Integer.parseInt(tempVar);
				  }
				  String tempVar2 = ConsoleInput.scanfRead(" ");
				  if (tempVar2 != null)
				  {
					  m = Integer.parseInt(tempVar2);
				  }
				  if (n == 0)
				  {
				  break;
				  }
				   for (l = 0;l < n;l++)
				   {
								  a[0][l] = l + 1; //??????????
				   }
				  for (k = 1;k < n;k++)
				  {
								   p = m % (n - k + 1); //???K???????????
								   for (j = 0;j <= n - k;j++)
								   {

												 q = (p + j) % (n - k + 1); //????????????
												 a[k][j] = a[k - 1][q];
												 b = a[k][0];
								   }
				  }
				  System.out.printf("\n%d",a[n - 1][0]);
		  }
	}
}

