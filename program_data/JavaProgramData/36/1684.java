package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		char c;
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		n1 = str1.length();
		n2 = str2.length();
		for (int i = 0;i < n1;i++)
		{
			for (int j = 0;j < n1 - i - 1;j++)
			{
				if (str1.charAt(j) > str1.charAt(j + 1))
				{
				c = str1.charAt(j);
				str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j + 1));
				str1 = tangible.StringFunctions.changeCharacter(str1, j + 1, c);
				}
			}
		}
		for (int i = 0;i < n2;i++)
		{
			for (int j = 0;j < n2 - i - 1;j++)
			{
				if (str2.charAt(j) > str2.charAt(j + 1))
				{
				c = str2.charAt(j);
				str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j + 1));
				str2 = tangible.StringFunctions.changeCharacter(str2, j + 1, c);
				}
			}
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

