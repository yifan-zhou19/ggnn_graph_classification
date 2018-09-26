package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static void match(String a, char b, char g)
	{
		int i;
		int j;
		for (i = 0; ; i++)
		{
			if (a[i].equals(g))
			{
				break;
			}
		}
		for (j = i; j >= 0; j--)
		{
			if (a[j].equals(b))
			{
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				a[i] = a[j] = '*';
				break;
			}
		}
		if (j == 0)
		{
			return;
		}
		match(a, b, g);
	}
	public static int Main()
	{
		char b;
		char g;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = a.charAt(0);
		for (int i = 1; ; i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				g = a.charAt(i);
				break;
			}
		}
		match(a, b, g);
		return 0;
	}
}

