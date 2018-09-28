package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1001];
	public static int Main()
	{
		int n;
		int i;
		int s;
		int m;
		int j;
		int p = 0;
		int s1;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= 101;j++)
				{
					a[j] = 0;
				}
				for (j = 1;j <= m;j++)
				{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (j = 1;j <= m;j++)
				{
				if (a[j] + 3 * (j - 1) > 60)
				{
					break;
				}
				}
				j--;
				s = a[j] + 3 * (j - 1);
				s1 = s + 3;
				if (s1 <= 60)
				{
				p = 60 - s1;
				}
				else
				{
				p = 0;
				}
				System.out.print(p + a[j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

