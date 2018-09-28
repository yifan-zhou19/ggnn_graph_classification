package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length;
		length = str.length();
		int i;
		int j;
		int k = 0;
		char b;
		char g;
		b = str.charAt(0);
		for (i = 0;i < length;i++)
		{
			if (str.charAt(i) != b)
			{
				g = str.charAt(i);
				break;
			}
		}
		while (true)
		{
			if (str.charAt(0) == ' ')
			{
				break;
			}
			for (i = 1;i < length;i++)
			{
				if (str.charAt(i) == g)
				{
					j = i - 1;
					while (str.charAt(j) == ' ')
					{
						j--;
					}
					if (str.charAt(j) == g)
					{
						break;
					}
					else if (str.charAt(j) == b)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						str = tangible.StringFunctions.changeCharacter(str, j, ' ');
						break;
					}
				}
			}
		}
		return 0;
	}
}

