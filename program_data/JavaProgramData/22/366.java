package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e = 1;
	int m;
	int n;
	int i;
	int j;
	int[] t = new int[300];
	String s = new String(new char[1505]);
	String f = new String(new char[5]);
	char g;
	char h;
	s = new Scanner(System.in).nextLine();
	b = 0;
	d = 0;
	c = s.length();
	for (i = 0;i <= c;i++)
	{
	if (s.charAt(i) == ',' || s.charAt(i) == '\0')
	{
	d++;
	b++;
	}
	else
	{
	t[d] = t[d] * 10 + s.charAt(i) - '0';
	}
	}
	if (d == 1)
	{
	System.out.print("No");
	}
	else
	{
	j = t[0];
	for (a = 1;a < d;a++)
	{
	if (t[a] >= j)
	{
		j = t[a];
		e++;
	}
	}
	if (e == d)
	{
		System.out.print("No");
	}
	else
	{
	m = 0;
	for (a = 0;a < d;a++)
	{
	if (t[a] > m && t[a] < j)
	{
		m = t[a];
	}
	}
	System.out.printf("%d",m);
	}
	}
	}
}
