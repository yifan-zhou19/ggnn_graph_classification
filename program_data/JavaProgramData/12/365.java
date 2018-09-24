package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		while (true)
		{
			int n = 0;
			int sum = 0;
			for (i = 0; ; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == -1)
				{
					break;
				}
				else
				{
					if (a[i] != 0)
					{
						n++;
					}
					else
					{
						break;
					}
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					if (a[j] == 2 * a[k])
					{
						sum++;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

