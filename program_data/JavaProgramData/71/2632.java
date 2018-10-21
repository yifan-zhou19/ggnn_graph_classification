package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  int y;
		  int m1;
		  int m2;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   y = Integer.parseInt(tempVar2);
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   m1 = Integer.parseInt(tempVar3);
						   }
						   String tempVar4 = ConsoleInput.scanfRead(" ");
						   if (tempVar4 != null)
						   {
							   m2 = Integer.parseInt(tempVar4);
						   }
						   int t = 0;
						   int m;
						   int[] d = new int[50];
						   int[] a = new int[5000];
						   if (y % 4 == 0)
						   {
									 if (y % 100 != 0) //???
									 {
									 a[y] = 1;
									 }
									 else
									 {
										 if (y % 400 == 0)
										 {
										 a[y] = 1; //???
										 }
										 else
										 {
										 a[y] = 0; //????
										 }
									 }
						   }
						   else
						   {
						   a[y] = 0; //????
						   }

						   if (a[y] == 1)
						   {
								 if (m1 > m2)
								 {
								 for (m = m2;m < m1;m++)
								 {
												   if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
												   {
												   d[m] = 31;
												   }
												   else if (m == 2)
												   {
												   d[m] = 29;
												   }
												   else
												   {
												   d[m] = 30;
												   }
												   t = d[m] + t;
								 }
								 }
								 else
								 {
								 for (m = m1;m < m2;m++)
								 {
												   if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
												   {
												   d[m] = 31;
												   }
												   else if (m == 2)
												   {
												   d[m] = 29;
												   }
												   else
												   {
												   d[m] = 30;
												   }
												   t = d[m] + t;
								 }
								 }
						   }
						   else
						   {
							   if (m1 > m2)
							   {
								 for (m = m2;m < m1;m++)
								 {
												   if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
												   {
												   d[m] = 31;
												   }
												   else if (m == 2)
												   {
												   d[m] = 28;
												   }
												   else
												   {
												   d[m] = 30;
												   }
												   t = d[m] + t;
								 }
							   }
								 else
								 {
								 for (m = m1;m < m2;m++)
								 {
												   if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
												   {
												   d[m] = 31;
												   }
												   else if (m == 2)
												   {
												   d[m] = 28;
												   }
												   else
												   {
												   d[m] = 30;
												   }
												   t = d[m] + t;
								 }
								 }
						   }
						   if (t % 7 == 0)
						   {
						   System.out.print("YES\n");
						   }
						   else
						   {
						   System.out.print("NO\n");
						   }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

