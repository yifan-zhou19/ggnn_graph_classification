package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);

	int n;
	int p;
	int g;
	int t;
	int j;
	int i;
	int q;
	int m;
	while (gets(a) != '\0')
	{
	n = a.length();
	b = a;

	for (j = 0;j < n;j++)
	{
		if (a.charAt(j) == ')')
		{
			t = 0;
	for (p = j - 1;p >= 0;p--)
	{
	if (a.charAt(p) == '(')
	{
		a = tangible.StringFunctions.changeCharacter(a, p, ' ');
		a = tangible.StringFunctions.changeCharacter(a, j, ' ');
		t = 1;
		break;
	}
	}
	if (t != 1)
	{
	a = tangible.StringFunctions.changeCharacter(a, j, '?');
	}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a.charAt(i) == '(')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '$');
		}
	}
		for (q = 0;q < n;q++)
		{
			if (a.charAt(q) != '$' && a.charAt(q) != '?')
			{
				a = tangible.StringFunctions.changeCharacter(a, q, ' ');
			}
		}
			for (m = 0;m < n - 1;m++)
			{
				System.out.printf("%c",b.charAt(m));
			}
			System.out.printf("%c\n",b.charAt(n - 1));
			for (g = 0;g < n - 1;g++)
			{
				System.out.printf("%c",a.charAt(g));
			}
			System.out.printf("%c\n",a.charAt(n - 1));
	}








		return 0;
	}


}

