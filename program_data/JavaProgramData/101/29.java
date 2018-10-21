package <missing>;

public class GlobalMembers
{
	public static int A;
	public static int B;
	public static int C;
	public static int i;
	public static int j;
	public static int[] word = new int[3];
	public static String man = new String(new char[3]);
	public static int Main()
	{
		for (A = 0; A < 3; A++)
		{
		for (B = 0; B < 3; B++)
		{
		for (C = 0; C < 3; C++)
		{
			if (A != B && B != C && C != A)
			{
				word[A] = (B > A) + (A == C);
				word[B] = (A > B) + (A > C);
				word[C] = (C > B) + (B > A);
				man = tangible.StringFunctions.changeCharacter(man, A, 'A');
				man = tangible.StringFunctions.changeCharacter(man, B, 'B');
				man = tangible.StringFunctions.changeCharacter(man, C, 'C');
				if (word[0] > word[1] > word[2])
				{
					System.out.print(man.charAt(0));
					System.out.print(man.charAt(1));
					System.out.print(man.charAt(2));
					System.out.print("\n");
				}
			}
		}
		}
		}
		return 0;
	}
}

