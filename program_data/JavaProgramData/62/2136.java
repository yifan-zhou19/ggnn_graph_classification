package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		char b = ' ';
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != 0;i++)
		{
			while ((a.charAt(i) == b) && (a.charAt(i + 1) == b))
			{
				i++;
			}
			System.out.printf("%c",a.charAt(i));
		}
	}
}
