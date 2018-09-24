package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int j;
		int n;
		int court;
		while (true)
		{
			for (i = 0; 1 ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			n = i;
			for (i = 0, court = 0 ; i <= n; i++)
			{
				for (j = i; j <= n - 1; j++)
				{
					if (a[j] == 2 * a[i] || a[i] == 2 * a[j])
					{
						court++;
					}
				}
			}
			System.out.print(court);
			System.out.print("\n");
		}
		return 0;
	}
}

