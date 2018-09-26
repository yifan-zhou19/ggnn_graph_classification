package <missing>;

public class GlobalMembers
{
	public static int chance(String d)
	{
		int lend;
		int i;
		lend = d.length();
		for (i = 0;i < lend;i++)
		{
			if (d[i].compareTo(123) < 0 && d[i].compareTo(96) > 0)
			{
				d[i] = d[i] - 32;
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int lena;
		int lenb;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		chance(a);
		chance(b);
		if (strcmp(a, b) == 0)
		{
		System.out.print("=");
		System.out.print("\n");
		}
		if (strcmp(a, b) > 0)
		{
		System.out.print(">");
		System.out.print("\n");
		}
		if (strcmp(a, b) < 0)
		{
		System.out.print("<");
		System.out.print("\n");
		}
		return 0;
	}

}
