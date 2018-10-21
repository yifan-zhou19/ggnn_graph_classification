package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = str.length();
		int count = 1;
		for (int i = 1; i < length; i++)
		{
			if (str.charAt(i) == str.charAt(i - 1) || str.charAt(i) - 'a' == str.charAt(i - 1) - 'A' || str.charAt(i) - 'A' == str.charAt(i - 1) - 'a')
			{
				count++;
			}
			else
			{
				if (str.charAt(i - 1) - 'A' >= 0 && str.charAt(i - 1) - 'A' < 26)
				{
					System.out.print("(");
					System.out.print((char)str.charAt(i - 1));
				}
				else
				{
					System.out.print("(");
					System.out.print((char)(str.charAt(i - 1) - 'a' + 'A'));
				}
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				count = 1;
			}
		}
		if (str.charAt(length - 1) - 'A' >= 0 && str.charAt(length - 1) - 'A' < 26)
		{
			System.out.print("(");
			System.out.print((char)str.charAt(length - 1));
		}
		else
		{
			System.out.print("(");
			System.out.print((char)(str.charAt(length - 1) - 'a' + 'A'));
		}
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");
		return 0;
	}

}

