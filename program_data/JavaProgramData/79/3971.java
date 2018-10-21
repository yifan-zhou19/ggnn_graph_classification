package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n = 1;
		 int m = 1;
		 while (n != 0 && m != 0)
		 {
			 int i;
			 int s = 0;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 m = Integer.parseInt(tempVar2);
			 }
			 if (n == 0 && m == 0)
			 {
				 break;
			 }
			 else
			 {
				 int[] p;
				 int k;
				 int all;
				 p = new int[n];
				 for (i = 0;i < n;i++)
				 {
					 p[i] = i + 1;
				 }
				 k = 0;
				 for (i = 1,all = 0;;i++)
				 {
					  if (i % m == 0)
					  {
						  p[k] = 0;
						  all++;
					  }
					  if (all == n - 1)
					  {
						  for (i = 0;i < n;i++)
						  {
							  if (p[i] != 0)
							  {
								  System.out.printf("%d\n",p[i]);
							  }
						  }
							  break;
					  }
					  do
					  {
						  k = (k + 1) % n;
					  }while (p[k] == 0);
				 }
			 }
		 }

	}

}

