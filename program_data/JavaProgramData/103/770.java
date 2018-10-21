package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int sum = 1;
		int i;
		for (i = 0; str.charAt(i) != '\0';i++)
		{
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		for (i = 1; str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == str.charAt(i - 1))
			{
				sum++;
			}
			else
			{
				System.out.print('(');
				System.out.print(str.charAt(i - 1));
				System.out.print(',');
				System.out.print(sum);
				System.out.print(')');
				sum = 1;
			}
		}
		System.out.print('(');
		System.out.print(str.charAt(i - 1));
		System.out.print(',');
		System.out.print(sum);
		System.out.print(')');
		System.out.print("\n");
		return 0;
	}

}

