package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[10000]);
	char[][] d = new char[200][50];
	String b = new String(new char[50]);
	String c = new String(new char[50]);
	int i;
	int j;
	int l;
	int n = 0;
	int k = 0;
	int p;
	int q;
	int m;
	s = new Scanner(System.in).nextLine();
	l = s.length();
	for (i = 0;i < l;i++)
	{
	if (s.charAt(i) != ' ')
	{
	d[n][k] = s.charAt(i);
	k++;
	}
	else
	{
	d[n][k] = '\0';
	n++;
	k = 0;
	}
	}
	d[n][k] = '\0';
	p = String.valueOf(d[0]).length();
	q = p;
	b = d[0];
	c = d[0];
	for (j = 1;j <= n;j++)
	{
	m = String.valueOf(d[j]).length();
	if (p < m)
	{
	p = String.valueOf(d[j]).length();
	b = d[j];
	}
	if (q > m)
	{
	q = String.valueOf(d[j]).length();
	c = d[j];
	}
	}

	System.out.printf("%s\n%s",b,c);
	return 0;
	}
}
