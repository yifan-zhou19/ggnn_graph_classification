package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String one = new String(new char[80]);
		String two = new String(new char[80]);
		one = new Scanner(System.in).nextLine();
		two = new Scanner(System.in).nextLine();
		int i;
		int a = 0;
		for (i = 0;one.charAt(i) != '\0';i++)
		{
			if (one.charAt(i) >= 'A' && one.charAt(i) <= 'Z')
			{
				one.charAt(i) += 32;
			}
		}
		for (i = 0;two.charAt(i) != '\0';i++)
		{
			if (two.charAt(i) >= 'A' && two.charAt(i) <= 'Z')
			{
				two.charAt(i) += 32;
			}
		}
		if (strcmp(one,two) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(one,two) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(one,two) < 0)
		{
			System.out.print("<");
		}
		one = new Scanner(System.in).nextLine();
		return 0;
	}


}
