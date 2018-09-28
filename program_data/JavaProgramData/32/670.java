package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[102]);
		String s2 = new String(new char[102]);
		int p;
		int i;
		int j;
		int m;
		int n;
		int len1;
		int t;
		int len2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (t = 1;t <= m;t++)
		{
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		if (t < m)
		{
			System.in.read();
		}
		len1 = s1.length();
		len2 = s2.length();
		p = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			if (s1.charAt(len1 + i - len2) - p < s2.charAt(i))
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, len1 + i - len2, s1.charAt(len1 + i - len2) + 10 - p - s2.charAt(i) + 48);
				p = 1;
			}
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, len1 + i - len2, s1.charAt(len1 + i - len2) - p - s2.charAt(i) + 48);
				p = 0;
			}
		}
		i = 1;
		while (p == 1)
		{
			if (s1.charAt(len1 - i - len2) == '0')
			{
				s1.charAt(len1 - i - len2) += 9;
				i++;
			}
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, len1 - i - len2, s1.charAt(len1 - i - len2) - 1);
				p = 0;
			}
		}
		i = 0;
		p = 1;
		while (p == 1)
		{
			if (s1.charAt(i) == '0')
			{
				i++;
			}
			else
			{
				p = 0;
			}
		}
		for (j = i;j <= len1 - 1;j++)
		{
			System.out.print(s1.charAt(j));
		}
		System.out.print('\n');
		}


	}
}

