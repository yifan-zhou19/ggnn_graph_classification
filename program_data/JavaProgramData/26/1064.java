package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int len;
		int i;
		int signal;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		signal = 0;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ' && signal == 0)
			{
				System.out.print(" ");
				signal = 1;
			}
			else if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
				signal = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
