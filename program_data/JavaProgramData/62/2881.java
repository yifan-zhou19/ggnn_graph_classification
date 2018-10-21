package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i = 0;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c", a.charAt(i));
			}
			else if (a.charAt(i + 1) != ' ')
			{
				System.out.print(" ");
			}
			i++;
		}
		return 0;
	}

}
