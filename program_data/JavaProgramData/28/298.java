package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String p;
		p = str;
		int n;
		int i;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		str = tangible.StringFunctions.changeCharacter(str, n, ' ');
		for (i = 0;i <= n;i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				k += 1;
			}
		else
		{
			if (i < n && k != 0)
			{
				System.out.printf("%d,",k);
			}
			if (i == n && k != 0)
			{
				System.out.printf("%d",k);
			}
			k = 0;
		}
		}
		return 0;
	}
}

