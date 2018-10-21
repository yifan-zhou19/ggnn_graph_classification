package <missing>;

public class GlobalMembers
{
	public static int ss(String a)
	{
		int i = 0;
		int[] b = new int[100];
		int s = 0;
		int m;
		int n;
		while (!a[i].equals('a'))
		{
			i++;
		}

		if (i == 1)
		{
			b[0] = a[0] - 48;
			b[0] = 2 * b[0];
			if (b[0] > 9)
			{
				a[1] = b[0] % 10 + 48;
				a[0] = b[0] / 10 + 48;
				return 1;
			}
			else
			{
				a[0] = b[0] + 48;
				return 0;
			}
		}
		else
		{
			b[0] = a[0] - 48;
			if (b[0] >= 5)
			{
				for (m = (i - 1);m >= 0;m--)
				{
					if (m > 0)
					{
					b[m] = a[m] - 48;
					b[m] = b[m] + b[m];
					}
					else
					{
						b[0] = b[0] * 2;
					}
					if (b[m] > 9)
					{
						a[m + 1] = b[m] % 10 + 48 + s;
						s = 1;

					}
					else
					{
						a[m + 1] = b[m] + 48 + s;
						s = 0;

					}
					a[0] = 49;
				}
				return 1;
			}
			else
			{
				s = 0;
				for (m = (i - 1);m >= 0;m--)
				{
					b[m] = a[m] - 48;
					b[m] = b[m] * 2;
					if (b[m] > 9)
					{
						a[m] = b[m] % 10 + 48 + s;
						s = 1;
					}
					else
					{
						a[m] = b[m] + 48 + s;
						s = 0;
					}
				}
				return 0;
			}

		}
	}
	public static int Main()
	{
		int N;
		int i = 0;
		int o;
		int n = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);
		for (o = 0;o < 100;o++)
		{
			a = tangible.StringFunctions.changeCharacter(a, o, 'a');
		}
		if (N == 0)
		{
			System.out.print("1");
		}
		else
		{
			a = tangible.StringFunctions.changeCharacter(a, 0, 49);
			while (i < N)
			{
				n = n + ss(a);
				i++;
			}
			for (o = 0;o < n;o++)
			{
				System.out.print(a.charAt(o));
			}
		}
		return 0;
	}

}

