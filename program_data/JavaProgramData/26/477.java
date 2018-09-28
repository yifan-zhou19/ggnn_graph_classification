package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}
