package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('a' - 'A'));
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			int count = 0;
			while (a.charAt(i) == a.charAt(++i))
			{
				count++;
			}
			count++;
			i--;
			System.out.print("(");
			System.out.print(a.charAt(i));
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
		}
		return 0;
	}
}

