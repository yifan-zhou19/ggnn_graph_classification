package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[2000]);
		int i;
		int t = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a' + 'A');
			}
		}
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				t++;
			}
			else
			{
				t++;
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(t);
				System.out.print(")");
				t = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

