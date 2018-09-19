package <missing>;

public class GlobalMembers
{
	public static char f(String c)
	{
	int i;
	for (i = 0;i < 1000;i++)
	{
	if (c[i].compareTo('a') >= 0 && c[i].compareTo('z') <= 0)
	{
	c[i] = c[i] + 'A'-'a';
	}
	}
	}
	public static int Main()
	{
		int i;
		int m = 1;
	String a = new String(new char[1000]);
	a = new Scanner(System.in).nextLine();
	f(a);
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		if (a.charAt(i) == a.charAt(i + 1))
		{
	m++;
		}
	else
	{
		System.out.printf("(%c,%d)",a.charAt(i),m);
	m = 1;
	}
	}
	}
}
