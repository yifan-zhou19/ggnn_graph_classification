package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i1;
		  int i2;
		  int j;
		  int a;
		  int b;
		  int c;
		  int d;
		  int e = 0;
		  int[] y = new int[100000];
		  j = 0;
		  for (i1 = 0;;i1++)
		  {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b = Integer.parseInt(tempVar3);
						 }
						 y[j] = b;
						 j++;
						 if (a == 0 && b == 0)
						 {
						 break;
						 }
		  }
		  for (c = n - 1;c >= 0;c--)
		  {
							 d = 0;
							 if (c >= 1)
							 {
									 for (i2 = j - 1;i2 >= 0;i2--)
									 {
														   if (y[i2] == c)
														   {
														   d++;
														   }
									 }
														   if (d == n - 1)
														   {
																	 System.out.printf("%d",c);
																	 e++;
														   }

							 }
							 else
							 {
									 for (i2 = j - 1;i2 >= 0;i2--)
									 {
														   if (y[i2] == 0)
														   {
														   d++;
														   }
									 }
														   if (d == n)
														   {
																   System.out.print("0");
																   e++;
														   }

							 }
		  }
		  if (e == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
	}

}

