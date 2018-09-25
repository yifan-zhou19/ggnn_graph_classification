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
		String x = new String(new char[35]);
		x = new Scanner(System.in).nextLine();
		n = x.length();
		for (a = 0;a <= n - 1;a++)
		{
			if ((x.charAt(a) == '0') && ((x.charAt(a + 1) > '9') || (x.charAt(a + 1) < '1')))
			{
			System.out.print("0\n");
			}
			else
			{
				;
			}
			if ((x.charAt(a) <= '9') && (x.charAt(a) >= '1'))
			{
				m = 0;
				if (a == 0)
				{
				m = 1;
				}
				else if (x.charAt(a - 1) != '-')
				{
				m = 1;
				}
				else
				{
					;
				}
				if (m = 1)
				{
					for (b = a + 1;b <= n - 1;b++)
					{
						if ((x.charAt(b) > '9') || (x.charAt(b) < '0'))
						{
						break;
						}
						else
						{
							;
						}
					}
					for (c = a;c <= b - 1;c++)
					{
					System.out.printf("%c",x.charAt(c));
					}
					System.out.print("\n");
					a = b - 1;
				}
				else
				{
					;
				}
			}
			else
			{
				;
			}
		}
	}
}
