package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 0;A <= 2;A++)
		{
		 for (B = 0;B <= 2;B++)
		 {
		  for (C = 0;C <= 2;C++)
		  {
			  if (A == B || B == C || A == C || A == B == C)
			  {
				  continue;
			  }
			  a = (A < B) + (A == C);
			  b = (A > B) + (A > C);
			  c = (C > B) + (B > A);
			  if (a > b && b > c && A < B && B < C)
			  {
			   System.out.print("ABC");
			   System.out.print("\n");
			  }
			  if (a > c && c > b && A < C && C < B)
			  {
				System.out.print("ACB");
				System.out.print("\n");
			  }
			  if (b > a && a > c && B < A && A < C)
			  {
				System.out.print("BAC");
				System.out.print("\n");
			  }
			  if (b > c && c > a && B < C && C < A)
			  {
				System.out.print("BCA");
				System.out.print("\n");
			  }
			  if (c > a && a > b && C < A && A < B)
			  {
				System.out.print("CAB");
				System.out.print("\n");
			  }
			  if (c > b && b > a && C < B && B < A)
			  {
				System.out.print("CBA");
				System.out.print("\n");
			  }
		  }
		 }
		}

	return 0;





	}
}
