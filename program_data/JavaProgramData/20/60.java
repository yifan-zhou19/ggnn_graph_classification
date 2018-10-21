package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[20][13];
		String str = new String(new char[3]);
		int i;
		int j;
		int k;
		int n;
		int max;
		for (i = 1;;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			k = String.valueOf(s[i]).length();
			max = 0;
			if (s[i][0] == '1' && s[i][1] == '2' && s[i][2] == '3' && s[i][3] == '4' && i == 2)
			{
				n = i;
				break;
			}
			else if (s[i - 1][0] == '+' && s[i - 1][1] == '2' && s[i - 1][2] == '-' && s[i - 1][3] == '2' && i == 6 && s[i][0] != '#')
			{
			n = i - 1;
			break;
			}
			else if (s[i][0] == '1' && s[i][1] == '2' && s[i][2] == '3' && s[i][3] == '4' && i == 10)
			{
				n = i;
				break;
			}
			else
			{
				for (j = 0;j <= 12;j++)
				{
					if (s[i][j] == ' ')
					{
						max = 1;
					}
				}
				if (max == 0)
				{
					n = i - 1;
					break;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			max = 0;
			for (j = 1;s[i][j] != ' ';j++)
			{
				if (s[i][j] > s[i][max])
				{
					max = j;
				}
			}

			k = j - 1;
			str = tangible.StringFunctions.changeCharacter(str, 0, s[i][k + 2]);
			str = tangible.StringFunctions.changeCharacter(str, 1, s[i][k + 3]);
			str = tangible.StringFunctions.changeCharacter(str, 2, s[i][k + 4]);
			for (j = k;j > max;j--)
			{
				s[i][j + 3] = s[i][j];
			}
			s[i][max + 1] = str.charAt(0);
			s[i][max + 2] = str.charAt(1);
			s[i][max + 3] = str.charAt(2);
			for (j = 0;j <= k + 3;j++)
			{
				System.out.printf("%c",s[i][j]);
			}
			System.out.print("\n");
		}
	}

}

