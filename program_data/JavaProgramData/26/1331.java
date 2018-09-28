package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String a = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i - 1) != ' ')
				{
					System.out.print(a.charAt(i));
				}
			}
			else
			{
				System.out.print(a.charAt(i));
			}
			i++;
		}
		return 0;
	}
}
