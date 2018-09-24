package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int len;
		int count = 1;
		len = str.length();
		for (i = 0; i < len; i++)
		{
			if (str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'z' <= 0)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		if (len == 1)
		{
			System.out.print("(");
			System.out.print(str.charAt(0));
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
		}
		else
		{
			for (i = 0; i < len - 1; i++)
			{
				count = 1;
				while (str.charAt(i) == str.charAt(i + 1))
				{
					count++;
					i++;
				}
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
			}
			if (count == 1)
			{
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
			}
		}
		System.out.print("\n");

		return 0;
	}
}

