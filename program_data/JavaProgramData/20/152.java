package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String strsub = new String(new char[4]);
		String str2 = new String(new char[14]);
		int i;
		int j;
		int max;
		int maxnum;
		while (scanf("%s %s",str,strsub) != EOF)
		{
			max = 0;
			for (j = 0;;j++)
			{
				if (str.charAt(j) == '\0')
				{
					break;
				}
				if (str.charAt(j) > max)
				{
					max = str.charAt(j);
					maxnum = j;
				}
			}
			for (i = 0;i <= maxnum;i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str.charAt(i));
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, maxnum + 1, '\0');
			str2 += strsub;
			for (i = maxnum + 4;;i++)
			{
				if (str.charAt(i - 3) == '\0')
				{
					break;
				}
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str.charAt(i - 3));
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
			System.out.println(str2);
		}
	}

}

