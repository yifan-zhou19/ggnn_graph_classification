package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] c = new char[50][100];
		int i;
		int n = 0;
		int len1;
		int len2;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len1 = s.length();
		len2 = a.length();
		for (i = 0;i < len1;i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				c[n] = (s.Substring(k));
				k = i + 1;
				n++;
			}
		}
		c[n] = (s.Substring(k));
		for (i = 0;i < n + 1;i++)
		{
			if (strcmp(c[i],a) == 0)
			{
				c[i] = b;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s ",c[i]);
		}
		System.out.printf("%s",c[n]);
		return 0;
	}


}

