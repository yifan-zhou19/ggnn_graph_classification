package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		int n;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (j = 0;j < len;j++)
		{
			for (i = 0;i < len;i++)
			{
				if (i >= j)
				{
					if ((a.charAt(i - j) == a.charAt(i + j + 1)) && (a.charAt(i - j + 1) == a.charAt(i + j)))

					{
					n = 0;
					for (;n <= 2 * j + 1;n++)
					{
						System.out.printf("%c",a.charAt(i - j + n));
					}
					System.out.print("\n");
					}
				else
				{
					continue;
				}
				}
			}
		}
		return 0;
	}

}
