package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[103]);
		String b = new String(new char[103]);
		int i;
		int j;
		int k;
		int p;
		int l;
		int m;
		int n;
		int num;
		int h = 0;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		a = new Scanner(System.in).nextLine();
		m = a.length();
		b = new Scanner(System.in).nextLine();
		n = b.length();

		for (i = 0;i < l;i++)
		{
			num = 0;
			if (s.charAt(i) == a.charAt(0))
			{
				num = 1;
				for (j = 1;a.charAt(j) != '\0';j++)
				{
					if (s.charAt(i + j) == a.charAt(j))
					{
						num++;
					}
				}
				if (num == m && (s.charAt(i + j) == ' ' || s.charAt(i + j) == '\0') && n >= m)
				{
					if (i == 0 || (i != 0 && s.charAt(i - 1) == ' '))
					{
					for (k = 0;k < (l - m - i);k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, l - 1 + n - m - k, s.charAt(l - 1 - k));
					}
					for (p = 0;p < n;p++)
					{
						s = tangible.StringFunctions.changeCharacter(s, p + i, b.charAt(p));
					}
					s = tangible.StringFunctions.changeCharacter(s, l + n - m, '\0');
					i = i + n - 1;
					}
				}
				else if (num == m && (s.charAt(i + j) == ' ' || s.charAt(i + j) == '\0') && n < m)
				{
					if (i == 0 || (i != 0 && s.charAt(i - 1) == ' '))
					{
					for (k = 0;k < (l - m - i);k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, n + i + k, s.charAt(m + i + k));
					}
					for (p = 0;p < n;p++)
					{
						s = tangible.StringFunctions.changeCharacter(s, p + i, b.charAt(p));
					}
					s = tangible.StringFunctions.changeCharacter(s, l + n - m, '\0');
					i = i + n - 1;
					}
				}
				l = l + i;

			}

		}
		System.out.printf("%s",s);
	}
}

