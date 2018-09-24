package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (A = 0;A <= 2;A++)
		{
		  for (B = 0;B <= 2;B++)
		  {
			for (C = 0;C <= 2;C++)
			{
				 a = b = c = 0;
				 if (B > A)
				 {
					 a++;
				 }
				 if (C == A)
				 {
					 a++;
				 }
				 if (A > B)
				 {
					 b++;
				 }
				 if (A > C)
				 {
					 b++;
				 }
				 if (C > B)
				 {
					 c++;
				 }
				 if (B > A)
				 {
					 c++;
				 }
				 if (A + a == 2 && B + b == 2 && C + c == 2)
				 {
					 if (A > B && A > C)
					 {
						 if (B > C)
						 {
							 System.out.print("CBA");
						 }
						 if (C > B)
						 {
							 System.out.print("BCA");
						 }
					 }
					 if (B > A && B > C)
					 {
						 if (A > C)
						 {
							 System.out.print("CAB");
						 }
						 if (C > A)
						 {
							 System.out.print("ACB");
						 }
					 }
					 if (C > B && C > A)
					 {
						 if (B > A)
						 {
							 System.out.print("ABC");
						 }
						 if (A > B)
						 {
							 System.out.print("BAC");
						 }
					 }
				 }
			}
		  }
		}
	}
}
