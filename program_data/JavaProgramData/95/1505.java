package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int l1;
		int l2;
		int i;
		int m;
		int x;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l1 = a.length();
		l2 = b.length();
		if (l1 >= l2)
		{
			m = l2;
		}
		else
		{
			m = l1;
		}
		for (i = 0;i <= m - 1;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'a'+'A');
			}
			x = a.charAt(i) - b.charAt(i);
			if (x > 0)
			{
				System.out.print(">");
				break;
			}
			else if (x < 0)
			{
				System.out.print("<");
				break;
			}
		}
		if (i == m)
		{
			if (l1 > l2)
			{
				System.out.print(">");
			}
			else if (l1 == l2)
			{
				System.out.print("=");
			}
			else
			{
				System.out.print("<");
			}
		}
		return 0;
	}
}

