package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int n;
		int[] zz = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = m;i < m + n;i++)
		{
			zz[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n;i < m + n;i++)
		{
			zz[i - n] = zz[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(zz[i]);
			System.out.print(" ");
		}
		System.out.print(zz[n - 1]);
		System.out.print("\n");

	}
}

