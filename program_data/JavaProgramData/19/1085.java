package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	char[][] r =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	String t = new String(new char[100]);
	int i = 0;
	int j;
	int c = 0;
	int l;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	l = s.length();
	while (i <= l - 1)
	{
		j = 0;
	c++;
	while (s.charAt(i) != ' ' && i <= l - 1)
	{
		r[c][j] = s.charAt(i);
	j++;
	i++;
	}
	i++;
	}
	for (i = 1;i <= c - 1;i++)
	{
		if (strcmp(r[i],a) == 0)
		{
		System.out.printf("%s ",b);
		}
	else
	{
		System.out.printf("%s ",r[i]);
	}
	}
	if (strcmp(r[c],a) == 0)
	{
		System.out.printf("%s",b);
	}
	else
	{
		System.out.printf("%s",r[c]);
	}
	return 0;
	}
}
