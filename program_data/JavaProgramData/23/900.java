package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[50][200];
		String str = new String(new char[200]);
		int n = 0;
		int i = 0;
		int j = 0;
		int t;
		str = new Scanner(System.in).nextLine();
		t = str.length();
		while (n <= t)
		{
			if (str.charAt(n) != ' ')
			{
				s[i][j] = str.charAt(n);
				j++;
			}
			else
			{
				s[i][j] = '\0';
				i++;
				j = 0;
			}
			n++;
		}
		for (;i > 0;i--)
		{
			System.out.printf("%s ",s[i]);
		}
		System.out.printf("%s",s[0]);
	}
}
