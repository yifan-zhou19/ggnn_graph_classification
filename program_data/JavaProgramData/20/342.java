package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String temp = new String(new char[1024]);
		String a = new String(new char[512]);
		String b = new String(new char[512]);

		while (gets(temp) != null)
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* tok=strtok(temp," ");
			char tok = tangible.StringFunctions.strTok(temp," ");
			a = tok;
			tok = tangible.StringFunctions.strTok(null," ");
			b = tok;

			int maxindex = 0;
			int i;
			char maxchar = a.charAt(0);
			for (i = 1;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) > maxchar)
				{
					maxchar = a.charAt(i);
					maxindex = i;
				}
			}

			int length = a.length() - maxindex;
			int index = a.length() + 3;
			for (i = 1;i <= length;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, index, a.charAt(index - 3));
				index--;
			}
			index = maxindex + 1;
			for (i = 0;i <= 2;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, index, b.charAt(i));
				index++;
			}

			System.out.printf("%s\n",a);
		}
	}

}

