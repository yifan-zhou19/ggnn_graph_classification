package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void paixu(int[] p)
	{
		 int i;
		 int j;
		 int k;
		 for (i = 1;i <= n;i++)
		 {
						  for (j = i + 1;j <= n;j++)
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
		  int temp;
		  int sum;
		  int p;
		  int q;
		  for (;;)
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
				 else
				 {
					 for (i = 1;i <= n;i++)
					 {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
					 }
					 for (i = 1;i <= n;i++)
					 {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 b[i] = Integer.parseInt(tempVar3);
						 }
					 }
					 sum = 0;
					 paixu(a);
					 paixu(b);
					 for (i = 1,j = 1,p = n,q = n;i <= q;)
					 {
									  if (b[i] < a[j])
									  {
													sum += 200;
													i++;
													j++;
									  }
									  else
									  {
										  if (b[q] < a[p])
										  {
													   sum += 200;
													   p--;
													   q--;
										  }
										  else
										  {
											  if (b[i] == a[p])
											  {
															i++;
															p--;
											  }
											  else if (b[i] > a[p])
											  {
												   sum -= 200;
												   i++;
												   p--;
											  }
										  }
									  }
					 }
					 System.out.printf("%d\n",sum);
				 }
		  }

	}

}

