package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		int m = 0;
		for (int i = 0;i < 30;i++)
		{
			if (a.charAt(i) >= 48 && a.charAt(i) < 58)
			{
				System.out.print(a.charAt(i));
				m = 1;
			}
			else if (m == 1)
			{
				System.out.print("\n");
				m = 0;
			}
			else
			{
				continue;
			}
		}
		if (m == 1)
		{
			System.out.print("\n");
		}
		return 0;
	}

}
