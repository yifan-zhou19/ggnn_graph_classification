package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char b;
		char g;
		int i;
		int ii;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = a.charAt(0);
		g = a.charAt(a.length() - 1);
		for (ii = 0;ii < a.length();ii++)
		{
			for (i = ii;i >= 0;i--)
			{
				if ((a.charAt(ii) == g) && (a.charAt(i) == b))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(ii);
					System.out.print("\n");
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					a = tangible.StringFunctions.changeCharacter(a, ii, ' ');
				}
			}
		}
		return 0;
	}
}

