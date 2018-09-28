package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[85]);
		String b = new String(new char[85]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int la;
		int lb;
		int i;
		int t;
		la = a.length();
		lb = b.length();
		for (i = 0 ; i < la ; i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
			  a.charAt(i) += 32;
			}
		}
		for (i = 0 ; i < lb ; i++)
		{
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
			  b.charAt(i) += 32;
			}
		}
		if (la <= lb)
		{
			t = lb;
		}
		else
		{
			t = la;
		}
			for (i = 0 ; i < t ; i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					;
				}
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">");
					System.out.print("\n");
					break;
				}
				if (a.charAt(i) < b.charAt(i))
				{
					System.out.print("<");
					System.out.print("\n");
					break;
				}
				if (i == t - 1)
				{
				System.out.print("=");
				System.out.print("\n");
				}
			}
			return 0;
	}
}
