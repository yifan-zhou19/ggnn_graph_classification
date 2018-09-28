package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int m;
		m = a.length();
		for (i = 0;i < m;i++)
		{
			if ((i == 0 && a.charAt(i) == ' ') || (a.charAt(i - 1) == ' ' && a.charAt(i) == ' '))
			{
				continue;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}

			return 0;
	}

}
