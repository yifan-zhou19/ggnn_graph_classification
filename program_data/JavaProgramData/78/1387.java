package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int z;
	   int q;
	   int s;
	   int l;
	   int k;
	   int[] a = new int[4];
	   int i;
	   int j;
	   int m;
	   char[] b = {'z', 'q', 's', 'l'};
	   char w;
	   for (z = 10;z < 50;z = z + 10)
	   {
							for (q = 10;q < 50;q = q + 10)
							{
												if (z == q)
												{
													continue;
												}
												for (s = 10;s < 50;s = s + 10)
												{
												   if (z == s || q == s)
												   {
													   continue;
												   }
											   for (l = 10;l < 50;l = l + 10)
											   {
											  if (z == l || q == l || s == l)
											  {
												  continue;
											  }
											   }
											   if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
											   {
												   a[0] = z;
											   a[1] = q;
											   a[2] = s;
											   a[3] = l;


											   for (i = 0;i < 3;i++)
											   {
																for (j = 3;j > i;j--)
																{
																				   if (a[j] > a[j - 1])
																				   {
																					  m = a[j];
																					  a[j] = a[j - 1];
																					  a[j - 1] = m;
																					   w = b[j];
																					  b[j] = b[j - 1];
																					  b[j - 1] = w;
																				   }
																}
											   }
											   System.out.print(b[0]);
											   System.out.print(" ");
											   System.out.print(a[0]);
											   System.out.print("\n");
											   System.out.print(b[1]);
											   System.out.print(" ");
											   System.out.print(a[1]);
											   System.out.print("\n");
											   System.out.print(b[2]);
											   System.out.print(" ");
											   System.out.print(a[2]);
											   System.out.print("\n");
											   System.out.print(b[3]);
											   System.out.print(" ");
											   System.out.print(a[3]);
											   System.out.print("\n");

											   }

												}
							}
	   }
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	return 0;
	}

}

