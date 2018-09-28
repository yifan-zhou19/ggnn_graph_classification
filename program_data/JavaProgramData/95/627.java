package <missing>;

public class GlobalMembers
{
	public static char change(char a)
	{
		if (a >= 'a' && a <= 'z')
		{
			a = a - 'a'+'A';
		}
		return a;
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int a1 = a.length();
		int a2 = b.length();
		int i = 0;
		while (i < a1 && i < a2)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, change(a.charAt(i)));
			b = tangible.StringFunctions.changeCharacter(b, i, change(b.charAt(i)));
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
			i++;
		}
		if (i == a1 && i != a2)
		{
			System.out.print("<\n");
		}
		if (i == a2 && i != a1)
		{
			System.out.print(">\n");
		}
		if (i == a1 && i == a2)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}

