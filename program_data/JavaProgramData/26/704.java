package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int j;
		String a = new String(new char[101]);
		String[] p = new String[101];
		p[0] = a;

		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (k == 1)
				{
				continue;
				}

				else
				{
					System.out.printf("%c",a.charAt(i));
					k = 1;
				}
			}
			else
			{
				k = 0;
				System.out.printf("%c",a.charAt(i));
			}
		}

	}

}
