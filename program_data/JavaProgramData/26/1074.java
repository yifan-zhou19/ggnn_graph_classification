package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int c;
		a = new Scanner(System.in).nextLine();
		c = a.length();
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
			}
			else if (a.charAt(i - 1) != ' ')
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}
