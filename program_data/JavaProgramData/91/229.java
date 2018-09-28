package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (i != len - 1)
			{
				System.out.printf("%c",str.charAt(i) + str.charAt(i + 1));
			}
			else
			{
				System.out.printf("%c",str.charAt(len - 1) + str.charAt(0));
			}
		}
		return 0;
	}
}
