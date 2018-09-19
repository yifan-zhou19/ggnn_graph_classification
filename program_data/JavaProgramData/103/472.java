package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int start = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int s = 0;
		int len = str.length();
		for (i = start;i < len;i++)
		{
			if (str.charAt(i) - '0' == str.charAt(i + 1) - '0' || str.charAt(i) - '0' == str.charAt(i + 1) - '0' + 32 || str.charAt(i) - '0' == str.charAt(i + 1) - '0' - 32)
			{
				s++;
			}
			else
			{
				if (str.charAt(i) < 'a')
				{
						System.out.print("(");
						System.out.print(str.charAt(i));
						System.out.print(",");
						System.out.print(s + 1);
						System.out.print(")");
						s = 0;
						start = i + 1;
				}
				else
				{
						str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
						System.out.print("(");
						System.out.print(str.charAt(i));
						System.out.print(",");
						System.out.print(s + 1);
						System.out.print(")");
						s = 0;
						start = i + 1;
				}
			}
		}
		return 0;
	}
}

