package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	String c = new String(new char[100]);
	int i;
	int j;
	int k;
	int l;
	int m;
	int sum = 0;
	int v;
	int q = 0;
	int d;
	a = new Scanner(System.in).nextLine();
	j = a.length();
	for (v = 0;a.charAt(v) != ' ';v++)
	{
	q++;
	}
	d = 2 * q + 1;
	if (j % 2 == 1 && d == j)
	{
		k = (j - 1) / 2;
	for (i = 0;i < k;i++)
	{
	b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
	}
	for (i = k + 1;i < j;i++)
	{
	c = tangible.StringFunctions.changeCharacter(c, i - k - 1, a.charAt(i));
	}
	for (l = 0;l < k;l++)
	{
	for (m = 0;m < k;m++)
	{
	if (b.charAt(l) == c.charAt(m))
	{
		b = tangible.StringFunctions.changeCharacter(b, l, '0');
		c = tangible.StringFunctions.changeCharacter(c, m, '0');
	}
	}
	}
	for (l = 0;l < k;l++)
	{
	if (b.charAt(l) == '0' && c.charAt(l) == '0')
	{
		l = l;
	}
	else
	{
		break;
	}
	}
	if (l == k)
	{
		System.out.print("YES\n");
	}
	else
	{
		System.out.print("NO\n");
	}
	}
	else
	{
	System.out.print("NO\n");
	}
	}

}

