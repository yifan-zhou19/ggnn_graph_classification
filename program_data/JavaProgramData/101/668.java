package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int A;
	 int B;
	 int C;
	 String b = new String(new char[3]);
	 int[] a = new int[3];
	 for (A = 0;A < 3;A++)
	 {
		for (B = 0;B < 3;B++)
		{
		 if (A != B)
		 {
			C = 3 - A - B;
			a[0] = (((A > B) + (C == A)) == A);
			a[1] = (((A < B) + (A < C)) == B);
			a[2] = (((C < B) + (B < A)) == C);
			if ((a[0] + a[1] + a[2]) == 3)
			{
			 b = tangible.StringFunctions.changeCharacter(b, A, 'A');
			 b = tangible.StringFunctions.changeCharacter(b, B, 'B');
			 b = tangible.StringFunctions.changeCharacter(b, C, 'C');
			 System.out.print(b.charAt(2));
			 System.out.print(b.charAt(1));
			 System.out.print(b.charAt(0));
			 break;
			}
		 }
		 else
		 {
		 continue;
		 }
		}
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	return 0;
	}


}

