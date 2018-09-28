package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int s = 1;
	   int[][] qj = new int[50000][2];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i < n;i++)
	   {
		   for (int t = 0;t < 2;t++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   qj[i][t] = Integer.parseInt(tempVar2);
			   }
		   }
	   }
	   for (int k = 1;k <= n;k++)
	   {
		   for (int b = 0;b < n - k;b++)
		   {
			   int e;
			   int r;
			   if (qj[b][0] > qj[b + 1][0])
			   {
				  e = qj[b][0];
				  r = qj[b][1];
				  qj[b][0] = qj[b + 1][0];
				  qj[b][1] = qj[b + 1][1];
				  qj[b + 1][0] = e;
				  qj[b + 1][1] = r;
			   }
		   }

	   }
	   for (int p = 0;p < n - 1;p++)
	   {
		   if (qj[p + 1][0] > qj[p][1])
		   {
			  s = 0;
		   }
		   else
		   {
			   if (qj[p][1] > qj[p + 1][1])
			   {
				  qj[p + 1][1] = qj[p][1];
			   }
		   }
	   }
	   if (s == 0)
	   {
		   System.out.print("no");
	   }
	   else
	   {
		   System.out.printf("%d ",qj[0][0]);
		   for (int q = 1;q <= n;q++)
		   {
			   int f;
			   for (int u = 0;u < n - q;u++)
			   {
				   if (qj[u][1] < qj[u + 1][1])
				   {
					  f = qj[u][1];
					  qj[u][1] = qj[u + 1][1];
					  qj[u + 1][1] = f;
				   }

			   }

		   }
		   System.out.printf("%d",qj[0][1]);
	   }
	   return 0;


	}
}

