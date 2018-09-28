package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String str = new String(new char[20]);
		String str1 = new String(new char[20]);
		String str2 = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		if (str.length() < str1.length())
		{
			str2 = str;
			str = str1;
			str1 = str2;
		}
		for (i = 0;i < str.length();i++)
		{
			for (j = 0;j < str1.length();j++)
			{
				if (str.charAt(i) == str1.charAt(j))
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, '0');
					break;
				}
			}
		}
		for (i = 0;i < str.length();i++)
		{
			if (str1.charAt(i) != '0')
			{
				System.out.print("NO\n");
				break;
			}
		}
		if (i > str.length() - 1)
		{
			System.out.print("YES\n");
		}
	}

}

