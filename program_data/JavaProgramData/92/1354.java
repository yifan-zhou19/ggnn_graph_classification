package <missing>;

public class GlobalMembers
{
	public static void p(int[] masu, int n)
	{
		 int i;
		 int j;
		 int t;
		 for (i = 1;i <= n;i++)
		 {
			 for (j = n - 1;j >= i;j--)
			 {
				 if (masu[j - 1] > masu[j])
				 {
					t = masu[j - 1];
					masu[j - 1] = masu[j];
					masu[j] = t;
				 }
			 }
		 }
	}
	public static int Main()
	{
		  for (;;)
		  {
			  int n;
			  int[] a = new int[1100];
			  int[] b = new int[1100];
			  int i;
			  int j;
			  int sub = 0;
			  int x;
			  int y;
			  int k;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
				  break;
			  }
			  else
			  {
				   for (i = 0;i < n;i++)
				   {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   a[i] = Integer.parseInt(tempVar2);
					   }
				   }
				   for (i = 0;i < n;i++)
				   {
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   b[i] = Integer.parseInt(tempVar3);
					   }
				   }
				   p(a, n),p(b,n);
				   x = n - 1,y = n - 1,i = 0,j = 0;
				   for (;;)
				   {

						  if (a[i] > b[j])
						  {
							  sub = sub + 1;
							  i = i + 1;
							  j = j + 1;
						  }
						  else if (a[i] == b[j])
						  {
							   if (a[x] <= b[y])
							   {
							   if (a[i] < b[y])
							   {
								   sub = sub - 1;
							   }
							   i++;
							   y--;
							   }
							   else
							   {
								   sub = sub + 1,x = x - 1,y = y - 1;
							   }
						  }
						  else if (a[i] < b[j])
						  {
							  i = i + 1;
							  y = y - 1;
							  sub = sub - 1;
						  }
						  if (i > x)
						  {
							  break;
						  }
				   }
				   System.out.printf("%d\n",200 * sub);
			  }
		  }

	}

}

