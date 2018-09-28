package <missing>;

public class GlobalMembers
{
	public static void paixu(int n, int[] p)
	{
	 int i;
	 int j;
	 int k;
		 for (i = 0;i <= n - 2;i++)
		 {
			   for (j = i + 1;j <= n - 1;j++)
			   {
					 if (p[i] < p[j])
					 {
						 k = p[i];
						 p[i] = p[j];
						 p[j] = k;
					 }
			   }
		 }

	}
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int m;
	 int sum;
	 int n;
	 int u;
	 int p;
	 int[] t = new int[1000];
	 int[] q = new int[1000];
	 int[] c = new int[1000];
	 for (u = 0;u <= 1000;u++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 if (n == 0)
	 {
		 break;
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   t[i] = Integer.parseInt(tempVar2);
		   }
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   q[i] = Integer.parseInt(tempVar3);
		   }
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
		 c[i] = -9;
	 }
	 paixu(n, t);
	 paixu(n, q);
	 for (i = 0;i <= n - 1;i++)
	 {
		  if (t[0] > q[0])
		  {
			  c[i] = 200;
			  for (k = 0;k <= n - 2 - i;k++)
			  {
				  t[k] = t[k + 1];
			  }
		  }
		  else
		  {
			  for (j = n - 1 - i;j >= 0;j--)
			  {
					  if (t[j] <= q[j])
					  {
						  if (t[j] == q[0])
						  {
							  c[i] = 0;
						  }
						  else
						  {
							  c[i] = -200;
						  }
						  for (k = j;k <= n - 2 - i;k++)
						  {
							  t[k] = t[k + 1];
						  }
						  break;
					  }
			  }
		  }
		  if (c[i] != 0 && c[i] != 200 && c[i] != -200)
		  {
			  if (t[0] < q[0])
			  {
				  c[i] = -200;
			  }
			  else
			  {
				  c[i] = 0;
			  }
			  for (k = 0;k <= n - 2 - i;k++)
			  {
				  t[k] = t[k + 1];
			  }
		  }
		  for (k = 0;k <= n - 2 - i;k++)
		  {
			  q[k] = q[k + 1];
		  }

	 }
	 for (sum = 0,i = 0;i <= n - 1;i++)
	 {
		 sum = sum + c[i];
	 }
	 System.out.printf("%d\n",sum);
	 }




	}

}

