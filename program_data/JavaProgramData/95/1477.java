package <missing>;

public class GlobalMembers
{
	public static int change(String s, String t)

	{
	for (int i = 0; !s[i].equals(0); ++i)
	{
	if (s[i].compareTo('A') >= 0 && s[i].compareTo('Z') <= 0)
	{
	 s[i] += 'a'-'A';
	}
	}
	for (int i = 0; !t[i].equals(0); ++i)
	{
	if (t[i].compareTo('A') >= 0 && t[i].compareTo('Z') <= 0)
	{
	 t[i] += 'a'-'A';
	}
	}
	return strcmp(s, t);
	}
	public static int Main()
	{
		String s = new String(new char[81]);
		String t = new String(new char[81]);
		int a;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		a = change(s, t);
		if (a > 0)
		{
			System.out.print(">");
		}
		if (a < 0)
		{
			System.out.print("<");
		}
		if (a == 0)
		{
			System.out.print("=");
		}
		return 0;
	}

}
