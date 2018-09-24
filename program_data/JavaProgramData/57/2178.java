package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();

		for (;n > 0;n--)
		{
			String str = new String(new char[100]);

			str = new Scanner(System.in).nextLine();
			len = str.length();

			if (str.charAt(len - 1) == 'g')
			{
				str = tangible.StringFunctions.changeCharacter(str, len - 3, '\0');
			}
			else
			{
				str = tangible.StringFunctions.changeCharacter(str, len - 2, '\0');
			}

			System.out.println(str);
		}
	}
}

