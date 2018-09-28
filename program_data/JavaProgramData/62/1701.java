package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		System.out.printf("%c",a.charAt(0));
		for (int i = 1;i < a.length();i++)
		{
			if (a.charAt(i - 1) != ' ' && a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
			continue;
			}
			else if (a.charAt(i - 1) == ' ' && a.charAt(i) != ' ')
			{
				System.out.printf(" %c",a.charAt(i));
			}
		}

		return 0;
	}

}
