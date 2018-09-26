package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[101];
		int[] p = a;
		for (p = a;p < a + n;p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < m;i++)
		{
			p = a + n - 1;
			temp = p;
			for (p--;p >= a;p--)
			{
				p[1] = p;
			}
			p++;
			p[0] = temp;
		}
		for (p = a;p < a + n;p++)
		{
			if (p == a)
			{
				System.out.print(p);
			}
			else
			{
				System.out.print(' ');
				System.out.print(p);
			}
		}
		return 0;
	}
}

