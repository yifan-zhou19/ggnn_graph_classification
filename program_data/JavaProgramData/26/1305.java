package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		m = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
					continue;
				}
				else
				{
					System.out.printf("%c",a.charAt(i));
				}
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}



}
