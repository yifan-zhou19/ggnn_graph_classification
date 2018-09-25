package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int n;
		int count = 1;
		n = str.length();
		for (i = 0; i < n; i++)
		{
			if (str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'z' <= 0)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a' + 'A');
			}
		}
		for (i = 0; i < n - 1; i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				count++;
			}
			else
			{
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				count = 1;
			}
		}
		if (str.charAt(n - 2) == str.charAt(n - 1))
		{
			System.out.print("(");
			System.out.print(str.charAt(n - 1));
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
		}
		else
		{
			System.out.print("(");
			System.out.print(str.charAt(n - 1));
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
		}

		return 0;
	}

}

