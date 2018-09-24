package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int N;
		 int m;
		 int i;
		 int j;
		 int[] a = new int[10000];
		 int t;
		 int[] b = new int[10000];
		 int[] n = new int[10000];
		 int k;
		 int p = 0;
		 int x = 0;
		 int q;




			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 m = Integer.parseInt(tempVar);
			 }
			 for (j = 0;j < m;j++)
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[j] = Integer.parseInt(tempVar2);
				 }
			 }
			 b[0] = a[0];
			 for (j = 0;j < m;j++)
			 {
			  p = 0;
			  for (k = 0;b[k] != 0;k++)
			  {
					if (a[j] == b[k])
					{
						n[k]++;
						p = 1;
						break;
					}

			  }
			   if (p == 0)
			   {
				   b[k] = a[j];
				   n[k]++;
			   }
			 }
		   for (k = 0;b[k] != 0;k++)
		   {
			  x++;
			  if (x == 1)
			  {
				  System.out.printf("%d",b[k]);
			  }
			  else
			  {
				  System.out.printf(" %d",b[k]);
			  }

		   }



	   return 0;
	}

}

