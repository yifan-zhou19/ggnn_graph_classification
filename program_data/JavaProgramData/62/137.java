package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[210]);
		int i;
		int n;
		str = new Scanner(System.in).nextLine();
		System.out.printf("%c",str.charAt(0));
		for (i = 1,n = str.length();i < n;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
			{
				;
			}
			else
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
		System.out.print("\n");
	}

}
