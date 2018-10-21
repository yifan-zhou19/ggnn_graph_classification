package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int r;
		final String a = "";
		a = new Scanner(System.in).nextLine();
		k = Integer.parseInt(a);
		int m;
		for (i = 0;i <= k - 1;i++)
		{
			final String a = "";
			a = new Scanner(System.in).nextLine();
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				m = 0;
				for (r = 0;a.charAt(r) != '\0';r++)
				{
					if (a.charAt(r) == a.charAt(j))
					{
						m++;
					}
				}
				if (m == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
			}
			if (a.charAt(j) == '\0')
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}
