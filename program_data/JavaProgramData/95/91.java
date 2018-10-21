package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int t;
		int i;
		char ch;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0',b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) < 'Z' && a.charAt(i)>'A')
			{
				a.charAt(i) += 32;
			}
			if (b.charAt(i) < 'Z' && b.charAt(i)>'A')
			{
				b.charAt(i) += 32;
			}

			t = a.charAt(i) - b.charAt(i);
			if (t > 0)
			{
				ch = '>';
				System.out.print(ch);
				break;
			}
			if (t < 0)
			{
				ch = '<';
				System.out.print(ch);
				break;
			}
			if (t == 0)
			{
				continue;
			}


		}
		if (a.charAt(i) == '\0' && b.charAt(i) == '\0')
		{
			ch = '=';
			System.out.print(ch);
		}
		return 0;
	}
}
