package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int i;

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) += 32;
			}
		}

		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) += 32;
			}
		}

		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(a,b) >= 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
	}
}
