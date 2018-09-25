package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 1;
		int n = 1;
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0 && n == 0)
			{
				break;
			}
			int[] a = new int[301];
			int i = 0;
			int num = 0;
			int baoshu = 0;
			while (num != n - 1)
			{
				i++;
				if (a[i] == 0)
				{
					baoshu++;
				}
				if (baoshu == m)
				{
					a[i] = 1;
					baoshu = 0;
					num++;
				}
				if (i == n)
				{
					i = 0;
				}
			}
			for (i = 1; i <= n; i++)
			{
				if (a[i] == 0)
				{
					System.out.print(i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

