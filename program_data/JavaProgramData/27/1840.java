package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[][] a = new double[100][5];
		  double[][] b = new double[100][6];

		  for (l = 0;l <= n - 1;l++)
		  {
							 String tempVar2 = ConsoleInput.scanfRead();
							 if (tempVar2 != null)
							 {
								 a[l][0] = Double.parseDouble(tempVar2);
							 }
							 String tempVar3 = ConsoleInput.scanfRead(" ");
							 if (tempVar3 != null)
							 {
								 a[l][1] = Double.parseDouble(tempVar3);
							 }
							 String tempVar4 = ConsoleInput.scanfRead(" ");
							 if (tempVar4 != null)
							 {
								 a[l][2] = Double.parseDouble(tempVar4);
							 }
							 a[l][3] = a[l][1] * a[l][1] - 4 * a[l][0] * a[l][2];
							 if (a[l][3] > 0)
							 {
									b[l][0] = (-a[l][1] + Math.sqrt(a[l][1] * a[l][1] - 4 * a[l][0] * a[l][2])) / (2 * a[l][0]);
							 b[l][1] = (-a[l][1] - Math.sqrt(a[l][1] * a[l][1] - 4 * a[l][0] * a[l][2])) / (2 * a[l][0]);
							 }
							 else
							 {
								 if (a[l][3] == 0)
								 {
										b[l][0] = -a[l][1] / (2 * a[l][0]);
								 }
										else
										{
											b[l][0] = -a[l][1] / (2 * a[l][0]);
											if (b[l][0] == 0)
											{
												b[l][0] = 0;
											}
											b[l][1] = (Math.sqrt(4 * a[l][0] * a[l][2] - a[l][1] * a[l][1])) / (2 * a[l][0]);
										}
							 }
		  }
											for (l = 0;l <= n - 1;l++)
											{
																if (a[l][3] > 0)
																{
																			 System.out.printf("x1=%.5lf;x2=%.5lf\n",b[l][0], b[l][1]);
																}
																			 else
																			 {
																				 if (a[l][3] == 0)
																				 {
																							   System.out.printf("x1=x2=%.5lf\n", b[l][0]);
																				 }
																							   else
																							   {
																								   System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",b[l][0], b[l][1], b[l][0],b[l][1]);
																							   }
																			 }
											}
																								   System.in.read();
																									System.in.read();
	}







}

