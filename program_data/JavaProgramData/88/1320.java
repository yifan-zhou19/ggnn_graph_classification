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
			if (*(str.Substring(i)) >= '0' && *(str.Substring(i)) <= '9')
			{
				System.out.print((str.Substring(i)));
			}
			else
			{
				if (*(str.Substring(i) + 1) >= '0' && *(str.Substring(i) + 1) <= '9')
				{
					System.out.print("\n");
				}
			}
		}
		if (*(str + str.length() - 1) >= '0' && *(str + str.length() - 1) <= '9')
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
