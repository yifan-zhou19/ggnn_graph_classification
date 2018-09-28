package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a.charAt(i) += 32;
			}
		}
		for (i = 0;b.charAt(i) != 0;i++)
		{
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b.charAt(i) += 32;
			}
		}
		i = strcmp(a,b);
		if (i > 0)
		{
			System.out.print(">");
		}
		else if (i == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}
