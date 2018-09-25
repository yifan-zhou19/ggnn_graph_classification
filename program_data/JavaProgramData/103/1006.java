package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int n = 1;
		String str = new String(new char[1001]);

		str = new Scanner(System.in).nextLine();
		l = str.length();
		if (l == 1)
		{
			System.out.printf("(%c,%d)", str.charAt(0) % 32 + 64, 1);
		}
		else
		{
			for (i = 1; i < l; i++)
			{
				if ((str.charAt(i) % 32) == (str.charAt(i - 1) % 32))
				{
					n++;
				}
				else
				{
					System.out.printf("(%c,%d)", str.charAt(i - 1) % 32 + 64, n);
					n = 1;
				}
				if (i == l - 1)
				{
					System.out.printf("(%c,%d)", str.charAt(i) % 32 + 64, n);
				}
			}
		}
		return 0;
	}
}
