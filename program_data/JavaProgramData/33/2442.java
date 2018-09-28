package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == 'A')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, 'T');
				}
				else if (str.charAt(i) == 'T')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, 'A');
				}
				else if (str.charAt(i) == 'C')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, 'G');
				}
				else if (str.charAt(i) == 'G')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, 'C');
				}
				if (str.charAt(i + 1) != '\0')
				{
					System.out.printf("%c",str.charAt(i));
				}
				if (str.charAt(i + 1) == '\0')
				{
					System.out.printf("%c\n",str.charAt(i));
				}
			}
		}
		return 0;
	}








}

