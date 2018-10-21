package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;a.charAt(i) || b.charAt(i);i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a.charAt(i) -= 'a'-'A';
			}
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b.charAt(i) -= 'a'-'A';
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
		}
		if (!a.charAt(i) && !b.charAt(i))
		{
			System.out.print("=\n");
		}
		return 0;
	}


}
