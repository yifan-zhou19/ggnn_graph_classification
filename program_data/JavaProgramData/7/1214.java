package <missing>;

public class GlobalMembers
{
	// 13.2.cpp 
	//


	public static int Main()
	{
		String str1 = new String(new char[258]);
		String str2 = new String(new char[258]);
		String str3 = new String(new char[258]);
		String ch = new String(new char[600]);
		int len1;
		int len2;
		int len3;
		int i = 0;
		int j = 0;
		int m;
		int n = 0;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str3 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str1.length();
		len2 = str2.length();
		len3 = str3.length();
		for (i = 0; i < len1; i++)
		{
			n = 0;
			m = i;
			if (str1.charAt(m) == str2.charAt(j))
			{
				n = 1;
				for (j = 0, m; j < len2; j++, m++)
				{
					if (str1.charAt(m) != str2.charAt(j))
					{
						n = 0;
						j = 0;
						break;
					}
				}
				if (n == 1)
				{
					m = i;
					for (i = 0; i < len1 + len3 - len2; i++)
					{
						if (i >= m != 0 && i < m + len3)
						{
							ch = tangible.StringFunctions.changeCharacter(ch, i, str3.charAt(i - m));
						}
						else
						{
							if (i < m)
							{
								ch = tangible.StringFunctions.changeCharacter(ch, i, str1.charAt(i));
							}
							else
							{
								ch = tangible.StringFunctions.changeCharacter(ch, i, str1.charAt(len2 + i - len3));
							}
						}
					}
					break;
				}
			}
		}
		if (n == 1)
		{
			for (i = 0; i < len1 + len3 - len2; i++)
			{
				System.out.print(ch.charAt(i));
			}
		}
		else
		{
			for (i = 0; i < len1; i++)
			{
				System.out.print(str1.charAt(i));
			}
		}
		return 0;
	}


}

