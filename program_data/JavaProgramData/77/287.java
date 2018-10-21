package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static int match(String a, char m, char f)
	{
		int i;
		int j;
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (a[i].equals(f))
			{
			   break;
			}
		}
		if (a[i].equals('\0'))
		{
		   return 0;
		}
		for (j = i;j >= 0;j--)
		{
			if (a[j].equals(m))
			{
				System.out.print(j);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		a[j] = '*';
		a[i] = '*';
		match(a, m, f);
	}
	public static int Main()
	{
		char m;
		char f;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = a.charAt(0);
		int i;
		for (i = 0;i <= 999;i++)
		{
			if (a.charAt(i) != m)
			{
				f = a.charAt(i);
				break;
			}
		}
		match(a, m, f);
		return 0;
	}

}

