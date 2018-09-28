package <missing>;

public class GlobalMembers
{
	public static String line = new String(new char[100]);
	public static char male;
	public static int len;
	public static void hand()
	{
		int i;
		int j;
		for (i = 0;i < len;i++)
		{
			if (line.charAt(i) != male && line.charAt(i) != '\0')
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (line.charAt(j) == male)
					{
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						line = tangible.StringFunctions.changeCharacter(line, i, '\0');
						line = tangible.StringFunctions.changeCharacter(line, j, '\0');
						break;
					}
				}
			}
		}
	}
	public static int Main()
	{
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = line.length();
		male = line.charAt(0);
		hand();
		return 0;
	}




}

