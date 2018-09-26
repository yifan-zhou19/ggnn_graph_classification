package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int l;
		int k;
		String s = new String(new char[300]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = tangible.StringFunctions.changeCharacter(s, 0, '1');
		k = 1;
		for (i = 0; i < n; i++)
		{
			l = 0;
			for (j = 0; j < k; j++)
			{
				m = s.charAt(j) - '0';
				m = 2 * m + l;
				l = m / 10;
				m = m % 10;
				s = tangible.StringFunctions.changeCharacter(s, j, m + '0');
			}
			if (l != 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, l + '0');
				k++;
			}
		}
		for (i = k - 1; i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}
		return 0;
	}

}

