package <missing>;

public class GlobalMembers
{
	public static char trans(char k)
	{
		if ((k >= 'a') && (k <= 'z'))
		{
			return (k + 'A'-'a');
		}
		else
		{
			return (k);
		}
	}

	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int l1;
		int l2;
		int n = 0;

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l1 = a.length();
		l2 = b.length();

		for (i = 0;(i < l1) && (i < l2);i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, trans(a.charAt(i)));
			b = tangible.StringFunctions.changeCharacter(b, i, trans(b.charAt(i)));
			if (a.charAt(i) != b.charAt(i))
			{
					if (a.charAt(i) > b.charAt(i))
					{
						System.out.print(">");
					}
					else
					{
						System.out.print("<");
					}
					n++;
					break;
			}
		}

		if (n == 0)
		{
			System.out.print("=");
		}
	}
}

