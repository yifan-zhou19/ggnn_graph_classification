package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				a.charAt(i) += 32;
			}
			if (b.charAt(i) > 64 && b.charAt(i) < 91)
			{
				b.charAt(i) += 32;
			}
		}
		switch (strcmp(a,b))
		{
		case 1:
			System.out.print('>');
			break;
		case 0:
			System.out.print('=');
			break;
		case -1:
			System.out.print('<');
		}

	}

}
