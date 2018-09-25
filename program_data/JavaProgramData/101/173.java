package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int A = 0; //????3?????
	int B = 0;
	int C = 0;
	int wordA = 0; //??3????????
	int wordB = 0;
	int wordC = 0;
	for (A = 1;A <= 3;A++) //?A??
	{
		   for (B = 1;B <= 3;B++) //?B??
		   {
				 for (C = 1;C <= 3;C++) //?C??
				 {
					  if (A != B && A != C && B != C) //?A?B?C????????
					  {
							wordA = (B > A) + (C == A); //????A,B,C????
						  wordB = (A > B) + (A > C);
						  wordC = (C > B) + (B > A);
							if (A > B && B > C) //???6??????????
							{
									  if ((wordA < wordB) && (wordB < wordC))
									  {
										   System.out.print('C');
										   System.out.print('B');
										   System.out.print('A');
										   System.out.print("\n");
									  }
							}
							if (A < B && B < C)
							{
									  if ((wordB < wordA) && (wordC < wordB))
									  {
										  System.out.print('A');
										  System.out.print('B');
										  System.out.print('C');
										  System.out.print("\n");
									  }
							}
							if (A > C && C > B)
							{
									  if ((wordA < wordC) && (wordC < wordB))
									  {
										   System.out.print('B');
										   System.out.print('C');
										   System.out.print('A');
										   System.out.print("\n");
									  }
							}
							if (B > A && A > C)
							{
									  if ((wordB < wordA) && (wordA < wordC))
									  {
										   System.out.print('C');
										   System.out.print('A');
										   System.out.print('B');
										   System.out.print("\n");
									  }
							}
							if (B > C && C > A)
							{
									 if ((wordB < wordC) && (wordC < wordA))
									 {
										   System.out.print('A');
										   System.out.print('C');
										   System.out.print('B');
										   System.out.print("\n");
									 }
							}
							 if (C > A && A > B)
							 {
									 if ((wordC < wordA && wordA < wordB))
									 {
										   System.out.print('B');
										   System.out.print('A');
										   System.out.print('C');
										   System.out.print("\n");
									 }
							 }
					  }
				 }
		   }
	}
	 return 0;

	}
}
