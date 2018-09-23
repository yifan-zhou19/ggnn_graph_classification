package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[20][13];
		String str = new String(new char[3]);
		char[][] S = new char[20][13];
		int i;
		int j;
		int k;
		int n;
		int max;
		for (i = 1;(s[i][0] = System.in.read()) != EOF;i++)
		{
			s[i][1] = '\0';
			S[i] = new Scanner(System.in).nextLine();
			s[i] += S[i];
		}
		n = i - 1;
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

