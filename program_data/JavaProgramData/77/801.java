package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char a;
		char b;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		int i;
		int j;
		len = str.length();
		a = str.charAt(0);
		b = str.charAt(len - 1);
		for (i = 0;i < len;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (str.charAt(i) == b && str.charAt(j) == a)
				{
					System.out.print(j);
					System.out.print(' ');
					System.out.print(i);
					System.out.print("\n");
					str = tangible.StringFunctions.changeCharacter(str, j, b);
					break;
				}
			}
		}
		return 0;
	}
}

