package <missing>;

public class GlobalMembers
{
	//********************************************************
	//????1.cpp
	//???????????
	//********************************************************

	public static int Main()
	{
		int A; //????
		int B;
		int C;
		int wa;
		int wb;
		int wc;
		int i;
		char[] rank = {0, '\0', '\0'}; //??????
		for (A = 0;A <= 2;A++)
		{ //for????????
		for (B = 0;B <= 2;B++)
		{
		   if (A == B)
		   {
			   continue;
		   }
		   for (C = 0;C <= 2;C++)
		   {
			   if (A == C || B == C)
			   {
				   continue;
			   }
			   wa = (B > A) + (C == A); //??????????
			   wb = (A > B) + (A > C);
			   wc = (C > B) + (B > A);
					  if (!(A < B && wa <= wb != 0 || A < C && wa <= wc != 0 || B < A && wb <= wa != 0 || B < C && wb <= wc != 0 || C < A && wc <= wa != 0 || C < B && wc <= wb))
						 //????????????????????????????

					  {
			  rank[A] = 'A';
			  rank[B] = 'B';
			  rank[C] = 'C';
							 for (i = 0;i <= 2;i++) //??????????
							 {
				 System.out.print(rank[i]);
							 }
					  }
		   }
		}
		}
		return 0;
	}
}
