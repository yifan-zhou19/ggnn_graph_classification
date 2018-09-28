package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int a1;
		int b1;
		int m = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		a1 = a.length();
		b1 = b.length();
		for (i = 0;i < a1;i++)
		{
			if ((int)a.charAt(i) >= 'A' && (int)a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, (char)((int)a.charAt(i) + 32));
			}
		}
		for (i = 0;i < b1;i++)
		{
			if ((int)b.charAt(i) >= 'A' && (int)b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, (char)((int)b.charAt(i) + 32));
			}
		}
		for (i = 0;i < a1 - 1;i++)
		{
			if ((int)a.charAt(i) > (int)b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if ((int)a.charAt(i) < (int)b.charAt(i))
			{
				System.out.print("<");
				break;
			}
			else if ((int)a.charAt(i) == (int)b.charAt(i))
			{
				m += 1;
				continue;
			}
		}
		if (m == a1 - 1)
		{
			System.out.print("=");
		}
		return 0;
	}
}

