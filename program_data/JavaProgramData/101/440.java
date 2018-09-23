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
	   a = (B > A) + (C == A);
	   b = (A > B) + (A > C);
	   c = (C > B) + (B > A);
	   for (A = 1;A < 4;A++)
	   {
		 for (B = 1;B < 4;B++)
		 {
		   for (C = 1;C < 4;C++)
		   {
			  if (((A > B && a < b) || (A == B && a == b) || (A < B && a> b)) + ((A> C && a < c) || (A == C && a == c) || (A < C && a> c)) + ((B < C && b> c) || (B> C && b < c) || (B == C && b == c)) == 3)
			  {
			  System.out.print("BCA");
			  }
		   }
		 }
	   }
	 return 0;
	}
}
