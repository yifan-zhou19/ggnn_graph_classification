package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int n = 0;
		int i;
		if (num == 0 || num == -0)
		{
			m = 0;
			return m;
		}
		else if (num < 0)
		{
			i = Math.abs(num);
				while (i != 0)
				{
					n = n * 10 + i % 10;
					i = i / 10;
				}
				m = -n;
				return m;
		}
		else if (num > 0)
		{
			i = num;
			while (i != 0)
			{
					n = n * 10 + i % 10;
					i = i / 10;
			}
			m = n;
				return m;

		}
	}
	public static int m;
	public static int Main()
	{
		int num;
		int i = 0;
		while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			reverse(num);
			System.out.print(m);
			System.out.print("\n");
		}
		return 0;
	}









}

