package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int A;
			int B;
			int C;
			String a = new String(new char[4]);
			for (A = 1;A <= 3;A++)
			{
			   for (B = 1;B <= 3;B++)
			   {
					   if (A == B)
					   {
						   continue;
					   }
					   C = 6 - A - B;
					   if ((A + (B > A) + (C == A) == 3) && (B + (A > B) + (A > C) == 3) && (C + (C > B) + (B > A) == 3) == 1)
					   {
							   a = tangible.StringFunctions.changeCharacter(a, A, 'A');
							   a = tangible.StringFunctions.changeCharacter(a, B, 'B');
							   a = tangible.StringFunctions.changeCharacter(a, C, 'C');
							   System.out.print(a.charAt(1));
							   System.out.print(a.charAt(2));
							   System.out.print(a.charAt(3));
							   System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							   goto T;
					   }
			   }
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			T:
			return 0;
	}

}

