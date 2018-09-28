package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		 int i;
		 int j = 0;
		 int n;
		 int k = 1;
		 int t;
		 int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
		 int[] a = new int[m];
		  for (n = 3;n <= m;n += 2)
		  {
		  t = Math.sqrt(n);
		  i = 2;
			  for (i = 2;;i++)
			  {
				if (n % i == 0)
				{
					break;
				}
			if (i > t)
			{
				a[j] = n;
				j++;
				break;
			}
			  }

		  }
	  t = 0;
		   for (i = 0;i <= j;i++)
		   {
			   for (k = i;k <= j;k++)
			   {
					  if (a[i] + a[k] == m)
					  {
								t++;
							  System.out.printf("%d %d\n",a[i],a[k]);
					  }
			   }
		   }
						if (t == 0)
						{
						System.out.print("no\n");
						}
	  }

}

