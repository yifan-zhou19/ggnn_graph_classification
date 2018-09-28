package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (i == 0)
			{
				System.out.printf("%c",a.charAt(i));
			}
			else if (a.charAt(i - 1) == ' ' && a.charAt(i) != ' ')
			{
				System.out.printf(" %c",a.charAt(i));
			}
			else if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
			}
		}

		return 0;
	}

}
