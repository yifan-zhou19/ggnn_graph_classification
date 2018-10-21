package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int j;
		int n;
		int r;
		int ok;
		String a = new String(new char[505]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (r = 2;r <= n;r++)
		{
			for (i = 0;i <= n - r;i++)
			{
				ok = 1;
				j = i + r - 1;
				for (s = i;s <= i + (j - i) / 2;s++)
				{
					if (a.charAt(s) != a.charAt(j + i - s))
					{
						ok = 0;
						break;
					}
				}
				if (ok != 0)
				{
					for (s = i;s <= j;s++)
					{
						System.out.printf("%c",a.charAt(s));
					}
					System.out.print("\n");
				}
			}
		}
	}

}
