package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int i;
		int j;
		int n;
		int nn;
		int count;
		nn = 0;
		while ((a[1] != 0 && a[1] != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			nn++;
			count = 0;
			for (n = 2; n <= 16; n++)
			{
				a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[n] == 0)
				{
					break;
				}
			}
			for (i = 1; i <= n - 1; i++)
			{
				if (a[i] % 2 == 0)
				{
					for (j = 1; j <= n - 1; j++)
					{
						if (a[j] * 2 == a[i])
						{
							count++;
						}
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}
}

