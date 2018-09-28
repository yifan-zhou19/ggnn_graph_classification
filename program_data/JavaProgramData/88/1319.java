package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[35]);
		int i;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				if (str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9')
				{
					System.out.print("\n");
				}
			}
		}
		if (str.charAt(str.length() - 1) >= '0' && str.charAt(str.length() - 1) <= '9')
		{
			System.out.print("\n");
		}
		else
		{
			;
		}
		return 0;
	}
}
