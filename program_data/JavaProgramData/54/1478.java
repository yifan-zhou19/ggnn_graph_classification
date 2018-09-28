package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int t;
		int j;
		int[] app = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
			app[j] = k;
		}
		do
		{
			app[n] += n;
			for (i = n - 1;i >= 1;i--)
			{
				if (app[i + 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
					app[i] = (app[i + 1] * n) / (n - 1) + k;
				}
			}
		}while (i >= 1);

			System.out.print(app[1]);

		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

