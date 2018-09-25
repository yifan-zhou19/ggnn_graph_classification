package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String str2 = new String(new char[5]);
		int i;
		int count = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; str.charAt(i) != '\0';)
		{
			count = 0;
			str2 = tangible.StringFunctions.changeCharacter(str2, 0, str.charAt(i));
			if (str2.charAt(0) <= 'z' && str2.charAt(0) >= 'a')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, 0, str2.charAt(0) - 32);
			}
			for (; str.charAt(i) == str2.charAt(0) || str.charAt(i) == str2.charAt(0) + 32;)
			{
				count++;
				if (str.charAt(i) != '\0')
				{
					i++;
				}
			}
			System.out.print("(");
			System.out.print(str2.charAt(0));
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
		}
		System.out.print("\n");
		return 0;
	}
}

