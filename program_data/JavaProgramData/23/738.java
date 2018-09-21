package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		char[][] c = new char[100][100];
		char[][] b = new char[100][100];
		int j;
		int t;
		int l;
		int i;
		int m = 0;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		str = tangible.StringFunctions.changeCharacter(str, l, ' ');
		str = tangible.StringFunctions.changeCharacter(str, l + 1, ' ');
		for (i = 0,j = 0;;j++)
		{
			if (str.charAt(j) == '\0')
			{
				break;
			}
			if (str.charAt(j) == ' ')
			{
				t = j;
				c[i] = str.substring(0, t);
				i++;
				for (j = t + 1;;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j - t - 1, str.charAt(j));
					if (str.charAt(j) == '\0')
					{
						break;
					}
				}
				m++;
				j = 0;
			}
		}
		for (i = 0;i < m;i++)
		{
			b[i] = c[m - i - 1];
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%s ",b[i]);
		}
		System.out.printf("%s\n",b[m - 1]);
	}



}

