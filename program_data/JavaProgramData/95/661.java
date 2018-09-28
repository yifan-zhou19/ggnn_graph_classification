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
		int n;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) += 32;
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) += 32;
			}
		}
		if (a.length() > b.length())
		{
			n = a.length();
		}
		else
		{
			n = b.length();
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				if (i == n - 1)
				{
					System.out.print("=\n");
				}
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
		}
		return 0;
	}



}
