package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[20001];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			for (int j = i + 1;j <= n;j++)
			{
				if (m[i] == m[j])
				{
						for (j;j <= n;j++)
						{
						m[j] = m[j + 1];
						}
					n = n - 1;
					i = i - 1;
				}
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.print(m[i]);
			System.out.print(' ');
		}
		System.out.print(m[n]);
		System.out.print("\n");
		return 0;
	}
}

