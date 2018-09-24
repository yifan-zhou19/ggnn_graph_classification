package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int m;
		int n;
		int[] a = new int[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		p = 1;
		while (m / 10 != 0)
		{
			a[p - 1] = m % 10;
			m = m / 10;
			p++;
		}
			a[p - 1] = m;
			for (int j = 0;j < p;j++)
			{
			System.out.print(a[j]);
			}
			return 0;

	}

}

