package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int la;
		int lb;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a.charAt(i) += 32;
			}
		}
		for (i = 0;i < lb;i++)
		{
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b.charAt(i) += 32;
			}
		}
		i = strcmp(a,b);
		if (i > 0)
		{
			System.out.print(">\n");
		}
		else if (i == 0)
		{
			System.out.print("=\n");
		}
		else
		{
			System.out.print("<\n");
		}
		return 0;
	}
}
