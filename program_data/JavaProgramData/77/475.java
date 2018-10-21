package <missing>;

public class GlobalMembers
{
	public static int out(String str, char a, char b)
	{
		if (str[0].equals('!'))
		{
			return 1;
		}
		else
		{
			for (int i = 0;i < str.length();i++)
			{
					if (str[i].equals(b))
					{
								 str[i] = '!';
								 for (int j = i;j >= 0;j--)
								 {
										 if (str[j].equals('!'))
										 {
											 continue;
										 }
										 else
										 {
												 System.out.print(j);
												 System.out.print(' ');
												 System.out.print(i);
												 System.out.print("\n");
												 str[j] = '!';
												 return out(str, a, b);
										 }
								 }
					}
			}
		}
	}
	public static int Main()
	{
		String line = new String(new char[100]);
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		out(line, line.charAt(0), line.charAt(line.length() - 1));
		return 0;
	}

}

