package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String m = new String(new char[3]);
		char[][] s = new char[100][81];
		m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);

		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			int num = 0;
			if (s[i][0] == '_' || (64 < s[i][0] && s[i][0] < 91) || (96 < s[i][0] && s[i][0] < 123))
			{
				for (j = 0;j < String.valueOf(s[i]).length();j++)
				{
					if ((47 < s[i][j] && s[i][j] < 58) || (64 < s[i][j] && s[i][j] < 91) || (96 < s[i][j] && s[i][j] < 123) || s[i][j] == '_')
					{
						num++;
					}
				}
				if (num == String.valueOf(s[i]).length())
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}
