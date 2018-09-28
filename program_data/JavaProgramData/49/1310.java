package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int m;
		String x = new String(new char[510]);
		x = new Scanner(System.in).nextLine();
		n = x.length();
		for (a = 1;a <= n - 1;a++)
		{
			for (b = 0;b <= n - 1 - a;b++)
			{
				m = 0;
				for (c = 0;c <= a / 2;c++)
				{
					if (x.charAt(b + c) != x.charAt(b + a - c))
					{
					m = 1;
					}
					else
					{
						;
					}
				}
				if (m == 0)
				{
					for (c = b;c <= b + a;c++)
					{
					System.out.printf("%c",x.charAt(c));
					}
					System.out.print("\n");
				}
				else
				{
					;
				}
			}
		}
	}

}
