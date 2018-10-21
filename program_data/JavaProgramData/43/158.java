package <missing>;

public class GlobalMembers
{
	public static int panduan(int n)
	{
		int j;
		for (j = 2;j * j <= n;j++)
		{
			if (n % j == 0)
			{
				break;
			}
		}
		if (j * j > n)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int i;
		int t = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i * 2 <= m;i++)
		{
			t = 0;
			if (i % 2 != 0 && (m - i) % 2 != 0)
			{
				t = panduan(i) + panduan(m - i);
				if (t == 2)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(m - i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}




}

