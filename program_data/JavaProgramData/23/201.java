package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n = 0;
		String str = new String(new char[100001]);
		char[][] s = new char[1001][21];
		str = new Scanner(System.in).nextLine();
		while (str.charAt(i) != '\0')
		{
			while (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			{
				s[n][j] = str.charAt(i);
				j++;
				i++;
			}
			s[n][j] = '\0';
			n++;
			j = 0;
			while (str.charAt(i) == ' ')
			{
				s[n][j] = str.charAt(i);
				i++;
				j++;
			}
			s[n][j] = '\0';
			n++;
			j = 0;
		}
		for (i = n - 1;i >= 0;i--)
		{
			System.out.printf("%s",s[i]);
		}
		return 0;
	}

}
