package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int sum;
		 int[] t = new int[6];
		 int[] s = new int[6];
		 int po;
		 int l;
		 int j;
		 int m;
		 int i;
		 for (a = 1 ; a <= 5 ; a++)
		 {
			 for (b = 1 ; b <= 5 ; b++)
			 {
				 for (c = 1 ; c <= 5 ; c++)
				 {
					 for (d = 1 ; d <= 5 ; d++)
					 {
						 for (e = 1 ; e <= 5 ; e++)
						 {
							 po = 0;
							  t[1] = a;
							  t[2] = b;
							  t[3] = c;
							  t[4] = d;
							  t[5] = e;
							 l = a + b + c + d + e;
							 m = a * b * c * d * e;

								 if (m == 120 && l == 15 && e != 2 && e != 3)
								 {
													 s[1] = (e == 1);
														  s[2] = (b == 2);
														  s[3] = (a == 5);
														  s[4] = (c != 1);
														  s[5] = (d == 1);

									  for (i = 1 ; i <= 5 ; i++)
									  {
										  if ((t[i] == 1 || t[i] == 2) && s[i] == 1)
										  {

												   po++;

										  }
										  else
										  {
										  continue;
										  }
									  }
									  if (po == 2 && c == 1)
									  {
											 System.out.print(a);
											 System.out.print(" ");
											 System.out.print(b);
											 System.out.print(" ");
											 System.out.print(c);
											 System.out.print(" ");
											 System.out.print(d);
											 System.out.print(" ");
											 System.out.print(e);
											 System.out.print("\n");
									  }
								 }
						 }
					 }
				 }
			 }
		 }
		 return 0;
	}

}
