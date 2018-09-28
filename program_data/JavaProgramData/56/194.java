package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[10]);
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i = 0;
			while (n != 0)
			{
				num = tangible.StringFunctions.changeCharacter(num, i++, n % 10 + '0');
				n /= 10;
			}
			num = tangible.StringFunctions.changeCharacter(num, i, '\0');
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

