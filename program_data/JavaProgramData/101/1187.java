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
	 for (A = 1;A <= 3;A++)
	 {
	  for (B = 1;B < 4;B++)
	  {
	   for (C = 1;C < 4;C++)
	   {
		 a = ((B > A) + (C == A));
		 b = ((A > B) + (A > C));
		 c = ((C > B) + (B > A));
		 if (((A > B && a < b) || (A == B && a == b) || (A < B && a> b)) + ((A> C && a < c) || (A == C && a == c) || (A < C && a> c)) + ((B < C && b> c) || (B> C && b < c) || (B == C && b == c)) == 3)
		 {
		  if (((A > B && a < b) || (A == B && a == b) || (A < B && a> b)) + ((A> C && a < c) || (A == C && a == c) || (A < C && a> c)) + ((B < C && b> c) || (B> C && b < c) || (B == C && b == c)) == 3)
		  {
						if (A >= B != 0 && A >= C != 0 && B >= C)
						{
							System.out.print("ABC");
						}
						else if (A >= B != 0 && A >= C != 0 && C >= B)
						{
							System.out.print("BCA");
						}
						else if (B >= A != 0 && B >= C != 0 && A >= C)
						{
							System.out.print("CAB");
						}
						else if (B >= A != 0 && B >= C != 0 && C >= A)
						{
							System.out.print("ACB");
						}
						else if (C >= A != 0 && C >= B != 0 && B >= A)
						{
							System.out.print("ABC");
						}
						else if (C >= A != 0 && C >= B != 0 && A >= B)
						{
							System.out.print("BAC");
						}
		  }
		 }
	   }
	  }
	 }
	 return 0;
	}
}
