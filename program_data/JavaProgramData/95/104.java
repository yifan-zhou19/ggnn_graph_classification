package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n1;
		int m;
		String a = new String(new char[30]);
		String b = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n1 = a.length();
		for (i = 0;i < n1;i++)
		{
			if ((int)a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if ((int)b.charAt(i) > 96)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
			m = strcmp(a,b);
			if (m == 0)
			{
				System.out.print("=");
			}
			if (m < 0)
			{
				System.out.print("<");
			}
			if (m > 0)
			{
				System.out.print(">");
			}
		return 0;
	}
}

