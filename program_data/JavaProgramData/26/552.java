package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		System.out.printf("%c",str.charAt(0));
		for (i = 1;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.printf("%c",str.charAt(i));
			}
			else if (str.charAt(i - 1) != ' ')
			{
				System.out.print(" ");
			}
			else
			{
				continue;
			}
		}
		System.out.print("\n");
	}

}
