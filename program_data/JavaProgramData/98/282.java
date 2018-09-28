package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[500][41];
		int[] b = new int[500];
		int i;
		int j;
		int sum = 0;
		int k = 0;
		String p = a;
		int[] q = b;
		for (i = 0;i < n;i++)
		{
			*(p.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			q[i] = String.valueOf(*(p.Substring(i))).length() + 1;
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + q[i];
			if (sum > 81)
			{
				for (j = k;j < i - 1;j++)
				{
					System.out.print((p.Substring(j)));
					System.out.print(' ');
				}
				System.out.print((p.Substring(i) - 1));
				System.out.print("\n");
				sum = (q + i);
				k = i;
			}
		}
		for (j = k;j < n - 1;j++)
		{
			System.out.print((p.Substring(j)));
			System.out.print(' ');
		}
		System.out.print((p.Substring(n) - 1));
		System.out.print("\n");
		return 0;
	}
}

