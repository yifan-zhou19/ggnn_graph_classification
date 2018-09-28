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
		int a; //a=guess A
		int b;
		int c;
		int d;
		int e;
		for (A = 1;A <= 5;A++)
		{
			for (B = 1;B <= 5;B++)
			{
			   if (A == B)
			   {
				   continue;
			   }
			   for (C = 1;C <= 5;C++)
			   {
				  if (A == C || B == C)
				  {
					  continue;
				  }
				  for (int D = 1;D <= 5;D++)
				  {
					 if (A == D || B == D || C == D)
					 {
						 continue;
					 }
					 E = 15 - A - B - C - D;
					 if (E == 2 || E == 3)
					 {
						 continue;
					 }

					 a = ((E == 1) ^ ((A == 1) || (A == 2)));
					 b = ((B == 2) ^ ((B == 1) || (B == 2)));
					 c = ((A == 5) ^ ((C == 1) || (C == 2)));
					 d = ((C != 1) ^ ((D == 1) || (D == 2)));
					 e = ((D == 1) ^ ((E == 1) || (E == 2)));

					 if ((a + b + c + d + e) == 0)
					 {
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
