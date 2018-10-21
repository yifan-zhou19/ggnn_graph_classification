package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int c;
		int d;
		int e;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = a.length();
		d = b.length();
		if (c >= d)
		{
			e = c;
		}
		else
		{
			e = d;
		}
		for (i = 0;i < e;i++)
		{
			if (a.charAt(i) < 91)
			{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;i < e;i++)
		{
			if (b.charAt(i) < 91)
			{
		b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}


		for (i = 0;i < e;i++)
		{
			if (a.charAt(i) > b.charAt(i) && a.charAt(i) - b.charAt(i) != 32)
			{
			System.out.print(">");
			System.out.print("\n");
		return 0;
			}
			else if (a.charAt(i) < b.charAt(i) && b.charAt(i) - a.charAt(i) != 32)
			{
				System.out.print("<");
				System.out.print("\n");
			return 0;
			}
		}
			System.out.print("=");
			System.out.print("\n");
			return 0;
	}



}

