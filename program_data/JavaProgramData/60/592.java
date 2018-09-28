package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int c = 0;
		  int e;
		  int d;
		  int i;
		  int b;
		  int g = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] p = new int[n];
		  for (i = 2;i <= n;i++)
		  {
						   p[i - 2] = 0;
						   for (b = 2;b <= Math.sqrt(i);b++)
						   {
										   if (i % b == 0)
										   {
										   p[i - 2]++;
										   }
						   }
										   if (p[i - 2] == 0)
										   {
													   a[c] = i;
													   c++;
										   }
		  }
													   for (d = 0;d < n;d++)
													   {
																	   e = a[d + 1] - a[d];
																	   if (e == 2)
																	   {
																			   System.out.printf("%d %d\n",a[d],a[d + 1]);
																	   g++;
																	   }
													   }
																	   if (g == 0)
																	   {
																	   System.out.print("empty");
																	   }
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
																	   System.in.read();
	}

}

