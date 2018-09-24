package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		int counts = 1;
		for (int i = 0; str.charAt(i - 1) != '\n'; i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, System.in.read());
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a' + 'A');
			}
		}
		for (int i = 0; str.charAt(i) != '\n'; i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				counts++;
			}
			else
			{
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(',');
				System.out.print(counts);
				System.out.print(')');
				counts = 1;
			}
		}
		return 0;
	}
}

