package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		final String sr = "";
		final String wrd = "";
		final String wod = "";
		final String wd = "";
		int i;
		int j = 0;
		int k;
		int n;
		int m;
		str = new Scanner(System.in).nextLine();
		wrd = new Scanner(System.in).nextLine();
		wod = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i <= n;i++)
		{
			if ((str.charAt(i) != ' ') && (str.charAt(i) != '\0'))
			{
				wd = tangible.StringFunctions.changeCharacter(wd, j, str.charAt(i));
				j = j + 1;
			}
			else
			{
				j = 0;
				m = wd.length();
				if (strcmp(wd,wrd) == 0)
				{
					for (k = i - m;k < i;k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, k, '\0');
					}
					for (k = i;k < n;k++)
					{
						sr = tangible.StringFunctions.changeCharacter(sr, k - i, str.charAt(k));
						str = tangible.StringFunctions.changeCharacter(str, k, '\0');
					}
					str += wod;
					str += sr;
					n = str.length();
					for (k = 0;k < (n - i);k++)
					{
						sr = tangible.StringFunctions.changeCharacter(sr, k, '\0');
					}
					for (k = 0;k < m;k++)
					{
						wd = tangible.StringFunctions.changeCharacter(wd, k, '\0');
					}
				}
				else
				{
					for (k = 0;k < m;k++)
					{
						wd = tangible.StringFunctions.changeCharacter(wd, k, '\0');
					}
				}
			}
		}
		System.out.println(str);
	}
}

