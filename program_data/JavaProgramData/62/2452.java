package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		int n;
		a = new Scanner(System.in).nextLine();
		System.out.printf("%c",a.charAt(0));
		for (i = 1;a.charAt(i);i++)
		{
			if (a.charAt(i) != ' ')
			{
			System.out.printf("%c",a.charAt(i));
			}
			else if (a.charAt(i) == ' ')
			{
				if (a.charAt(i - 1) != ' ')
				{
				   System.out.printf("%c",a.charAt(i));
				}

			}
		}

			return 0;
	}
}
