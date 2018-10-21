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
	 for (A = 1;A < 4;A++)
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
				if (A < B)
				{
					if (A > C)
					{
						System.out.print("C");
						System.out.print("A");
						System.out.print("B");
					}
					else
					{
						if (B < C)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
						}
						else
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
						}
					}
				}
				else
				{
					if (B > C)
					{
						System.out.print("C");
						System.out.print("B");
						System.out.print("A");
					}
					else
					{
						if (A < C)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
						}
						else
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
						}
					}
				}

			}
	   }
	  }
	 }
	 return 0;
	}
}
