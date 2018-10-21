package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int n;
		int j;
		int p;
		a = new Scanner(System.in).nextLine();
		for (n = 2;n <= a.length();n++)
		{
			for (i = 0;i + n <= a.length();i++)
			{
				p = 1;
				for (j = i;j - i <= n - 1;j++)
				{
					if (a.charAt(j) == a.charAt(2 * i + n - 1 - j))
					{
						p = p * 1;
					}
					else
					{
						p = p * 0;
					}
				}
				if (p == 1)
				{
					for (j = i;j - i <= n - 1;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
