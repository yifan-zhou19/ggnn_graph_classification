package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m = 1;
		  int n = 1;
		  int x;
		  int[] a = new int[300];
		  while (m != 0 || n != 0)
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
					 if (m != 0 || n != 0)
					 {
							 x = n;
							 int i;
							 for (i = 0;i < 300;i++)
							 {
							 a[i] = 0;
							 }
							 int k = 0;
							 int l = 1;
							 while (x != 0)
							 {
										if (k >= n)
										{
										k = 0;
										}
										if (l > m)
										{
										l = 1;
										}
										while (k < n && l <= m)
										{
												  if (a[k] != m)
												  {
															 a[k] = l;
															 if (l == m)
															 {
															 x = x - 1;
															 }
															 if (x == 0)
															 {
																	 System.out.printf("%d\n",k + 1);
																	 break;
															 }
															 l++;

												  }
												  k++;
												  if (m == 0)
												  {
												  break;
												  }
										}
							 }
					 }

		  }
		  System.in.read();
		  System.in.read();
	}

}

