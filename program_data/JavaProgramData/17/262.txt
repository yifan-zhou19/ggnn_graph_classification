package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[200]);
		String str2 = new String(new char[200]);
		int i = 0;
		int length;
		int sign;
		int flag;
		char c;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		while (c != EOF)
		{
			i = 0;
			sign = -1;
		while (c != '\n')
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, c);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, ' ');
			}
			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, c);
			}
			i++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0');
		str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
		length = str2.length();
		i = 0;
		flag = 0;
		while (i >= 0)
		{
			if (str2.charAt(i) == '(')
			{
			sign = i;
			}
			if (str2.charAt(i) == ' ')
			{
				if (i == length - 1)
				{
					if (flag == 1)
					{
						flag = 0;
						i = -1;
					}
					else
					{
						break;
					}
				}
				i++;
				continue;
			}
			if ((str2.charAt(i) == ')') && (sign >= 0))
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, sign, ' ');
				str2 = tangible.StringFunctions.changeCharacter(str2, i, ' ');
				flag = 1;
				sign = -1;
			}
			if (i == length - 1)
			{
				if (flag == 1)
				{
					flag = 0;
					i = -1;
					sign = -1;
				}
				else
				{
					break;
				}
			}
			i++;
		}
		for (i = 0;i < length;i++)
		{
			if (str2.charAt(i) == '(')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, '$');
			}
			if (str2.charAt(i) == ')')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, '?');
			}
		}
		System.out.printf("%s\n",str1);
		System.out.printf("%s\n",str2);
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == '(' || c == ')')
		{
			continue;
		}
		else
		{
			break;
		}
		}
		return 0;
	}








}

