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
		int[] word = new int[6];
		for (A = 1;A <= 5;A++)
		{
						 for (B = 1;B <= 5;B++)
						 {
										  if (B == A)
										  {
											  continue;
										  }
							  for (C = 1;C <= 5;C++)
							  {
											   if (C == A || C == B)
											   {
												   continue;
											   }
								   for (D = 1;D <= 5;D++)
								   {
													if (D == A || D == B || D == C)
													{
														continue;
													}
													E = 15 - A - B - C - D;
													if (E == 2 || E == 3)
													{
														continue; //????
													}
													word[A] = (E == 1);
													word[B] = (B == 2);
													word[C] = (A == 5);
													word[D] = (C != 1);
													word[E] = (D == 1); //????????????
													if (word[1] == 1 && word[2] == 1 && word[3] == 0 && word[4] == 0 && word[5] == 0) //?????????????
													{
																  System.out.print(A);
																  System.out.print(" ");
																  System.out.print(B);
																  System.out.print("");
																  System.out.print(" ");
																  System.out.print(C);
																  System.out.print(" ");
																  System.out.print(D);
																  System.out.print(" ");
																  System.out.print(E);
																  break;
													}
								   }
							  }
						 }
		}
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}
}
