package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len1;
		int len2;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'0',100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,'0',100);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = a.length();
			len2 = b.length();
			for (int j = 0;j < len1 - j;j++)
			{
				t = a.charAt(j);
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(len1 - j - 1));
				a = tangible.StringFunctions.changeCharacter(a, len1 - j - 1, t);
			}
			for (int j = 0;j < len2 - j;j++)
			{
				t = b.charAt(j);
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(len2 - j - 1));
				b = tangible.StringFunctions.changeCharacter(b, len2 - j - 1, t);
			}
			for (int j = 0;j < len2;j++)
			{
				if (a.charAt(j) >= b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j) + '0');
				}
				else
				{
					a.charAt(j + 1)--;
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j) + '0');
				}
			}
			if (a.charAt(len1 - 1) != '0')
			{
				System.out.print(a.charAt(len1 - 1));
			}
			for (int j = len1 - 2;j >= 0;j--)
			{
				System.out.print(a.charAt(j));
			}
			System.out.print("\n");
		}
	}

}

