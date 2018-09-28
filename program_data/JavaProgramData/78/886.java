package <missing>;

public class GlobalMembers
{
	//*****************
	//???***********
	public static int Main()
	{
		   int z = 1;
		   int q = 1;
		   int s = 1;
		   int l = 1;
		   int Z = 1;
		   int Q = 1;
		   int S = 1;
		   int L = 1;
		   for (z = 1;z <= 5;z++)
		   {
			   for (q = 1;q <= 5;q++)
			   {
				   for (s = 1;s <= 5;s++)
				   {
					   for (l = 1;l <= 5;l++)
					   {
						   if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
						   {
							   Z = z * 10;
							   Q = q * 10;
							   S = s * 10;
							   L = l * 10;
						   }
					   }
				   }
			   }
		   }
								for (int i = 50;i >= 10;i = i - 10)
								{
								   if (Z == i)
								   {
									   System.out.print('z');
									   System.out.print(' ');
									   System.out.print(Z);
									   System.out.print("\n");
								   }
								   if (Q == i)
								   {
									   System.out.print('q');
									   System.out.print(' ');
									   System.out.print(Q);
									   System.out.print("\n");
								   }
								   if (S == i)
								   {
									   System.out.print('s');
									   System.out.print(' ');
									   System.out.print(S);
									   System.out.print("\n");
								   }
								   if (L == i)
								   {
									   System.out.print('l');
									   System.out.print(' ');
									   System.out.print(L);
									   System.out.print("\n");
								   }
								}
							   return 0;
	}
}
