package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int index;
		int len;
		int len2;
		String str = new String(new char[101]);
		String word = new String(new char[101]);
		String newword = new String(new char[101]);
		String temp = new String(new char[101]);
		while (gets(str))
		{
			index = 0;
			len = str.length();
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			newword = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;i <= len;i++)
			{
				if (str.charAt(i) == ' ' || i == len)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, index, '\0');
					if (strcmp(temp,word) == 0)
					{
						System.out.print(newword);
					}
					else
					{
						System.out.print(temp);
					}
					if (str.charAt(i) == ' ')
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("\n");
					}
					index = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(temp,0,(Character.SIZE / Byte.SIZE));
				}
				else
				{
					temp = tangible.StringFunctions.changeCharacter(temp, index++, str.charAt(i));
				}
			}
			System.in.read();
		}
		return 0;
	}

}

