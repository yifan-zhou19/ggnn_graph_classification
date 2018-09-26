package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		System.out.printf("%c",a.charAt(0));
		for (int i = 1;;i++)
		{
			if ((a.charAt(i) != ' ' || a.charAt(i - 1) != ' ') && a.charAt(i) != '\0')
			{
				System.out.printf("%c",a.charAt(i));
			}
			if (a.charAt(i) == '\0')
			{
				break;
			}
		}
		return 0;
	}

}
