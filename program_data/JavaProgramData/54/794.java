package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] mon = new int[100];
		int i;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon[n] = k;
		i = n;
		do
		{
			mon[n] = mon[n] + n;
			for (i = n - 1;i >= 1;i--)
			{
				if (mon[i + 1] % (n - 1) != 0)
				{
				break;
				}
				else
				{
				mon[i] = n * mon[i + 1] / (n - 1) + k;
				}
			}
		}while (i >= 1);
		System.out.print(mon[1]);
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}
}

