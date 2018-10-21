package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int s = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];

		a[0] = m;
		for (int i = 0;i <= 98;i++)
		{
			a[i + 1] = a[i] / 2;
			if (a[i + 1] == 1)
			{
				s = i + 1;
				break;
			}
		}
		for (int h = 0;h <= 99;h++)
		{
			for (int i = 0;i <= s;i++)
			{
				if (a[i] == n)
				{
					System.out.print(n);
					return 0;
				}
			}
					n = n / 2;
		}
	}
}

