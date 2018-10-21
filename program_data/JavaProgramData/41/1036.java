package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		int a;
		int b;
		int c;
		int d;
		int e;
		for (E = 1; E <= 5; E++)
		{
			if (E == 2 || E == 3)
			{
			continue;
			}
			 for (B = 1; B <= 5; B++)
			 {
				  for (C = 1; C <= 5; C++)
				  {
					   for (D = 1; D <= 5; D++)
					   {
							for (A = 1; A <= 5; A++)
							{
								if (A * B * C * D * E != 120)
								{
								  continue;
								}
								a = (E == 1);
								b = (B == 2);
								c = (A == 5);
								d = (C != 1);
								e = (D == 1);
								if (a != 0)
								{
									  if (A != 1 && A != 2)
									  {
									  continue;
									  }
								}
								if (a == 0)
								{
									 if (A == 1 || A == 2)
									 {
									 continue;
									 }
								}
								if (b != 0)
								{
									  if (B != 1 && B != 2)
									  {
									   continue;
									  }
								}
								if (b == 0)
								{
									 if (B == 1 || B == 2)
									 {
									 continue;
									 }
								}
								 if (c != 0)
								 {
									  if (C != 1 && C != 2)
									  {
									   continue;
									  }
								 }
							 if (c == 0)
							 {
									 if (C == 1 || C == 2)
									 {
									 continue;
									 }
							 }
								if (d != 0)
								{
									  if (D != 1 && D != 2)
									  {
									   continue;
									  }
								}
							   if (d == 0)
							   {
									 if (D == 1 || D == 2)
									 {
									 continue;
									 }
							   }
								if (e != 0)
								{
									  if (E != 1 && E != 2)
									  {
									   continue;
									  }
								}
								if (e == 0)
								{
									 if (E == 1 || E == 2)
									 {
									 continue;
									 }
								}
								System.out.print(A);
								System.out.print(' ');
								System.out.print(B);
								System.out.print(' ');
								System.out.print(C);
								System.out.print(' ');
								System.out.print(D);
								System.out.print(' ');
								System.out.print(E);
							}
					   }
				  }
			 }
		}

		return 0;
	}

}
