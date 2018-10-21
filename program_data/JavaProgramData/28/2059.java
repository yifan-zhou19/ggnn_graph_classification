package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int k = 0;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		m = (int)a.length();
		a = tangible.StringFunctions.changeCharacter(a, m, ' ');
		for (i = 0;i <= m;i++)
		{
			if (a.charAt(i) != ' ')
			{
				k = k + 1;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ' && i < m)
			{
				System.out.printf("%d,",k);
				k = 0;
			}
			else if (i == m)
			{
				System.out.printf("%d",k);
			break;
			}
			else
			{
				continue;
			}
		}
		return 0;
	}


}

