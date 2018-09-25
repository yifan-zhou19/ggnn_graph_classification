package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= a.length() - 1;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a.charAt(i) += 32;
			}
		}
		for (i = 0;i <= b.length() - 1;i++)
		{
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b.charAt(i) += 32;
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}

	}
}
