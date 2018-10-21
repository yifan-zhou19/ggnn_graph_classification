package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char term;
		int i;
		int j;
		int len1;
		int len2;
		int k;
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

		len1 = str1.length();
		len2 = str2.length();
		if (len1 == len2)
		{
		for (j = 1;j <= len1;j++)
		{
				for (i = 0;i < len1 - j;i++)
				{
					if (str1.charAt(i) > str1.charAt(i + 1))
					{
						term = str1.charAt(i);
						str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i + 1));
						str1 = tangible.StringFunctions.changeCharacter(str1, i + 1, term);
					}
				}
		}
					for (j = 1;j <= len2;j++)
					{
						for (i = 0;i < len2 - j;i++)
						{
					if (str2.charAt(i) > str2.charAt(i + 1))
					{
						term = str2.charAt(i);
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i + 1));
						str2 = tangible.StringFunctions.changeCharacter(str2, i + 1, term);
					}
						}
					}
						k = 0;
						for (i = 0;i < len1;i++)
						{
							if ((str1.charAt(i) - '0') != (str2.charAt(i) - '0'))
							{
								k = 1;
							}
						}
		}
		if ((len1 != len2) || k == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}


}

