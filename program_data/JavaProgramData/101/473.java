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
		  if (A == 1)
		  {
				if (B == 2)
				{
					System.out.print("ABC");
					System.out.print("\n");
				}
			else
			{
				System.out.print("ACB");
				System.out.print("\n");
			}
		  }
		  if (A == 2)
		  {
	  if (B == 1)
	  {
		  System.out.print("BAC");
		  System.out.print("\n");
	  }
	   else
	   {
		   System.out.print("CAB");
		   System.out.print("\n");
	   }
		  }
		  if (A == 3)
		  {
			  if (B == 1)
			  {
				  System.out.print("BCA");
				  System.out.print("\n");
			  }
				   else
				   {
					   System.out.print("BAC");
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
