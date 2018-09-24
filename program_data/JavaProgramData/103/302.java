package <missing>;

public class GlobalMembers
{
	public static char UpperCase(char chr)
	{
		if (chr >= 'a' && chr <= 'z')
		{
			return 'A'-'a' + chr;
		}
		else
		{
			return chr;
		}
	}
	public static int Main()
	{
		String str = new String(new char[1000]);
		int count = 1;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char chr = str.charAt(0);
		for (int i = 1;str.charAt(i) != 0;i++)
		{
			if (UpperCase(chr) == UpperCase(str.charAt(i)))
			{
				count++;
			}
			else
			{
				System.out.printf("(%c,%d)",UpperCase(chr),count);
				count = 1;
			}

			chr = str.charAt(i);

		}
		System.out.printf("(%c,%d)",UpperCase(chr),count);

		return 0;
	}
}

