package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char f = new char(char str[],char substr[],char rep[]);
		String str = new String(new char[256]);
		String substr = new String(new char[256]);
		String rep = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		f(str, substr, rep);
		System.out.println(str);
	}
	public static char f(String str, String substr, String rep)
	{
		String s = new String(new char[256]);
		int i = 0;
		int j;
		int k;
		for (i = 0; !str[i].equals('\0');i++)
		{
			if (str[i].equals(substr[0]))
			{
				   for (j = 0;j < substr.length();j++)
				   {
					s = tangible.StringFunctions.changeCharacter(s, j, str[j + i]);
				   }
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				if (strcmp(substr,s) == 0)
				{
					for (k = 0;k < rep.length();k++,i++)
					{
						str[i] = rep[k];
					}
					return 0;
				}
			}
		}
		return 0;
	}

}

