package <missing>;

public class GlobalMembers
{
	//******************
	//???????****
	public static int Main()
	{
		String str = new String(new char[201]);
		str = new Scanner(System.in).nextLine();
		int len;
		len = str.length();

		for (int i = 0;i < len;i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
				{
					System.out.print(str.charAt(i));
				}
				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' '))
				{
					continue;
				}
			}
		}
		return 0;
	}

}
