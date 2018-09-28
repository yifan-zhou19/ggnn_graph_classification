package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int s;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i <= 99;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			if (a.charAt(i) == '.')
			{
				System.out.print(".");
				break;
			}
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
