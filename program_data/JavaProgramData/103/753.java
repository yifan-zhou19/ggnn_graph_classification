package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1010]);
		char a;
		int c = 1;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) != str.charAt(i - 1) && str.charAt(i) != str.charAt(i - 1) + 32 && str.charAt(i) != str.charAt(i - 1) - 32)
			{
				if (str.charAt(i - 1) < 'Z')
				{
					a = str.charAt(i - 1);
				}
				else
				{
					a = str.charAt(i - 1) - 32;
				}
				System.out.print('(');
				System.out.print(a);
				System.out.print(',');
				System.out.print(c);
				System.out.print(')');
				c = 1;
			}
			else
			{
				c++;
			}
		}
		if (str.charAt(str.length() - 1) < 'Z')
		{
			a = str.charAt(str.length() - 1);
		}
		else
		{
			a = str.charAt(str.length() - 1) - 32;
		}
		System.out.print('(');
		System.out.print(a);
		System.out.print(',');
		System.out.print(c);
		System.out.print(')');
		System.out.print("\n");
		return 0;
	}
}

