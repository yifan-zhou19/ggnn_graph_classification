package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
	int i;
	int j;
	int n;
	int m;
	int p;
	int r;
	int x;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	n = a.length();
	p = b.length();
	for (i = 0;i < n;i++)
	{
		m = (int)a.charAt(i);
		if (m >= 97 && m <= 122)
		{
			m = m - 32;
			a = tangible.StringFunctions.changeCharacter(a, i, (char)m);
		}
	}
	for (j = 0;j < p;j++)
	{
		r = (int)b.charAt(j);
		if (r >= 97 && r <= 122)
		{
			r = r - 32;
			b = tangible.StringFunctions.changeCharacter(b, j, (char)r);
		}
	}
	x = strcmp(a,b);
	if (x > 0)
	{
		System.out.print(">");
	}
	else if (x == 0)
	{
		System.out.print("=");
	}
	else if (x < 0)
	{
		System.out.print("<");
	}
	}


}

