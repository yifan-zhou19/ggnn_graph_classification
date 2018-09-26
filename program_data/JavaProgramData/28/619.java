package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
		int i;
		int n;
		int word = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		str = tangible.StringFunctions.changeCharacter(str, n, ' ');
		for (i = 0;i < n + 1;i++)
		{
			if (str.charAt(i) != ' ')
			{
				word = word + 1;
			}
			else if (str.charAt(i) == ' ' && i != n && str.charAt(i - 1) != ' ')
			{
				System.out.printf("%d,",word);
														   word = 0;
			}
			else if (i == n)
			{
				System.out.printf("%d",word);
			}
		}
	}
}

