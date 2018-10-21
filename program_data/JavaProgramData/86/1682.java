package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] a = new int[20];
		int j;
		int s;
		int k;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				s = 60;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (k = m - 1;;k--)
				{
					if (a[k] + 3 * (k + 1) <= 63)
					{
						break;
					}
				}
				t = a[k] + 3 * k;
				if (t < 57)
				{
					s = a[k] + (57 - t);
				}
				else
				{
					s = a[k];
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

