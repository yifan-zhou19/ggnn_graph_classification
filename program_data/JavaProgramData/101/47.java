package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int A = 0; //????
		int B = 0;
		int C = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		char[] a = {0, 0, 0}; //????
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 0;C < 3;C++) //??A,B,C???
				{
					  if (A == C || B == C)
					  {
						  continue;
					  }
					  i = (B > A) + (A == C);
					  j = (A > B) + (A > C);
					  k = (C > B) + (B > A);
					  if (i + j + k == 3 & i != j & i != k & j != k & i + A == 2 & j + B == 2 & k + C == 2) //????????????????????
					  {
						  a[2 - A] = 'A'; //?????
						  a[2 - B] = 'B';
						  a[2 - C] = 'C';
						  System.out.print(a[2]);
						  System.out.print(a[1]);
						  System.out.print(a[0]);
						  System.out.print("\n");
					  }
				}
			}
		}
			return 0;
	}

}
