package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[14]);
		char cmax;
		String substr = new String(new char[4]);
		int i;
		int m;
		int j;
		int n;
		while (scanf("%s %s",str,substr) != EOF)
		{
			cmax = str.charAt(0);
			m = 0;
			for (i = 1;;i++)
			{
				if (str.charAt(i) == '\0')
				{
					n = i;
					break;
				}
				else if (str.charAt(i) > cmax)
				{
						cmax = str.charAt(i);
						m = i;
				}
			}
			str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
			for (i = n + 2,j = n - 1;;i--,j--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(j));
				if (j == m + 1)
				{
					break;
				}
			}
			for (i = m + 1,j = 0;j <= 2;i++,j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(j));
			}
			System.out.printf("%s\n",str);
		}
	}
}

