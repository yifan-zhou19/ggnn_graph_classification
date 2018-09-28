package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		String a = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = a.length();
		if (a.charAt(b - 1) == 'g' && a.charAt(b - 2) == 'n' && a.charAt(b - 3) == 'i')
		{
			a = tangible.StringFunctions.changeCharacter(a, b - 3, '\0');
			System.out.print(a);
			System.out.print("\n");
		}
		if (a.charAt(b - 1) == 'r' && a.charAt(b - 2) == 'e')
		{
			a = tangible.StringFunctions.changeCharacter(a, b - 2, '\0');
		   System.out.print(a);
		   System.out.print("\n");
		}
		if (a.charAt(b - 1) == 'y' && a.charAt(b - 2) == 'l')
		{
			a = tangible.StringFunctions.changeCharacter(a, b - 2, '\0');
			System.out.print(a);
			System.out.print("\n");
		}
		n--;
		}
		 return 0;
	}







}

