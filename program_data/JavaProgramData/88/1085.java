package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		int i;
		int m = a.length();
		for (i = 0;i < m - 1;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
			System.out.printf("%c",a.charAt(i));
			}
			else
			{
				if (a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9')
				{
				System.out.print("\n");
				}
			}
		}
		if (a.charAt(m - 1) >= '0' && a.charAt(m - 1) <= '9')
		{
		System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}
}
