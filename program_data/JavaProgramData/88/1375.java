package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";

		int i;
		a = new Scanner(System.in).nextLine();

		for (i = 0; a.charAt(i) != '\0'; i++)
		{
				 if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
				 {
					 System.out.printf("%c", a.charAt(i));
					 if (a.charAt(i + 1) < '0' || a.charAt(i + 1)>'9')
					 {
					 System.out.print("\n");
					 }
				 }
		}

		return 0;
	}
}
