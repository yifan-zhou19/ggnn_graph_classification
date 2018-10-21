package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[1000];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int p = 0;
		for (int i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		sort(a,a + N);
		for (int i = 0;i < N;i++)
		{
			if ((a[i] % 2) == 1)
			{
				if (p == 0)
				{
					System.out.print(a[i]);
					p = 1;
				}
				else
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
	return 0;
	}
}

