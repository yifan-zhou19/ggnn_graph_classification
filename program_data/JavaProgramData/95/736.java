package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) > 96)
			{
				a.charAt(i) -= 32;
			}
		}
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) > 96)
			{
				b.charAt(i) -= 32;
			}
		}
		s = strcmp(a,b);
		if (s < 0)
		{
			System.out.print('<');
		}
		if (s > 0)
		{
			System.out.print('>');
		}
		if (s == 0)
		{
			System.out.print('=');
		}
		return 0;
	}
}
