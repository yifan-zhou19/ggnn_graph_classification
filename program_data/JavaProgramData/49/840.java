package <missing>;

public class GlobalMembers
{
	public static void f1(String a, int l)
	{
		String b = new String(new char[501]);
		int j;
		for (j = 0;j < l;j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, l - j - 1, a[j]);
		}
		b = tangible.StringFunctions.changeCharacter(b, l, '\0');
		if (strcmp(a,b) == 0)
		{
			System.out.println(a);
		}
	}
	public static void f2(String s, int l, int L)
	{
		int m;
		int n;
		int i;
		String a = new String(new char[501]);
		for (m = 0;m < L - l + 2;m++)
		{
			i = 0;
			for (n = m;n < m + l;n++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, s[n]);
				i = i + 1;
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			f1(a, l);
		}
	}
	public static void f3(String s, int L)
	{
		int l;
		for (l = 2;l < L + 1;l++)
		{
			f2(s, l, L);
		}
	}
	public static void Main()
	{
		String s = new String(new char[501]);
		s = new Scanner(System.in).nextLine();
		int L;
		L = s.length();
		f3(s, L);
	}

}

