package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		int m;
		int n;
		int t;
		int p = 1;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		n = b.length();
		t = (m > n)?m:n;
		for (i = 0;i < t;i++)
		{
			if (a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 96)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				p = 0;
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				p = 0;
				break;
			}
		}
		if (p != 0)
		{
			if (m > n)
			{
				System.out.print(">");
			}
			if ((m = n) != 0)
			{
				System.out.print("=");
			}
				 else
				 {
					 System.out.print("<");
				 }
		}
	}
}

