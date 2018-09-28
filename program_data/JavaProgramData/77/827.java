package <missing>;

public class GlobalMembers
{
	public static int count = 0;
	public static int n = 0;

	public static int line(String b, int[] y)
	{
		int f;
		int len;
		len = b.length();
		if (n == 0)
		{
			System.out.print(y[0] - 1);
			System.out.print(" ");
			System.out.print(y[0]);
			System.out.print('\n');
			b[y[0]] = '0';
			b[y[0] - 1] = '0';
		}
		else
		{
			if (y[n - 1] + 1 < y[n])
			{
				for (f = y[n] - 1; !b[f].equals('0'); f--)
				{
					System.out.print(f);
					System.out.print(" ");
					System.out.print(y[n]);
					System.out.print('\n');
					b[f] = '0';
					b[y[n]] = '0';
					break;
				}
			}
			else
			{
				f = y[n] - 1;
				do
				{
					if (b[f].equals('0'))
					{
						f--;
					}

					else
					{
						System.out.print(f);
						System.out.print(" ");
						System.out.print(y[n]);
						System.out.print('\n');
						b[f] = '0';
						b[y[n]] = '0';
						break;
					}

				}while (1 != 0);
			}
		}
		n++;
		if (n < len / 2)
		{
			line(b, y);
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j = 0;
		int[] x = new int[100];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				x[j] = i;
				j++;
			}
		}
		line(a, x);
		return 0;
	}
}

