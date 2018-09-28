package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i + 1) != '\0';i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				 continue;

			}
			System.out.printf("%c",a.charAt(i));
		}

		 System.out.printf("%c",a.charAt(a.length() - 1));


		return 0;
	}
}
