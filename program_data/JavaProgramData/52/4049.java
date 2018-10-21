package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int[] p = new int[105];
		int[] u = new int[105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < a;i++)
		{
			u[i] = p[n - a + i];
		}
		for (i = a;i < n;i++)
		{
			u[i] = p[i - a];
		}
		for (i = 0;i < n;i++)
		{
				System.out.print((u + i));
				if (i != n - 1)
				{
					System.out.print(' ');
				}
		}

		return 0;

	}
}

