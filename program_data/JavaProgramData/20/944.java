package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (ConsoleInput.lastReadWasGood())
		{
			final String str = "";
			final String substr = "";
			final String ansstr = "";
			char cmax = 0;
			int point = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int length = str.length();
			for (int i = 0;i < length;i++)
			{
				if (str.charAt(i) > cmax)
				{
					cmax = str.charAt(i);
					point = i;
				}
			}
			for (int i = 0;i < point + 1;i++)
			{
				ansstr = tangible.StringFunctions.changeCharacter(ansstr, i, str.charAt(i));
			}
			for (int i = point + 1;i < point + 4;i++)
			{
				ansstr = tangible.StringFunctions.changeCharacter(ansstr, i, substr.charAt(i - point - 1));
			}
			for (int i = point + 4,j = point + 1;i < length + 3,j < length;i++,j++)
			{
				ansstr = tangible.StringFunctions.changeCharacter(ansstr, i, str.charAt(j));
			}
			System.out.print(ansstr);
			System.out.print("\n");
		}
		return 0;
	}
}

