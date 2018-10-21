package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String p = new String(new char[100]);
	String q = new String(new char[100]);
	p = new Scanner(System.in).nextLine();
	q = new Scanner(System.in).nextLine();
	int m;
	int n;
	m = p.length();
	n = q.length();
	for (int i = 0;i < m;i++)
	{
		if (p.charAt(i) >= 97 && p.charAt(i) <= 122)
		{
	p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i) - 32);
		}
	}
	for (int k = 0;k < n;k++)
	{
		if (q.charAt(k) >= 97 && q.charAt(k) <= 122)
		{
	q = tangible.StringFunctions.changeCharacter(q, k, q.charAt(k) - 32);
		}
	}
	int t;
	t = strcmp(p,q);
	if (t == 0)
	{
	System.out.print("=");
	}
	else if (t > 0)
	{
	System.out.print(">");
	}
	else
	{
	System.out.print("<");
	}
	return 0;
	}
}

