package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int count = 0;
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1; i <= 15; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			for (j = 0; j <= i - 2; j++)
			{
				for (k = j + 1; k <= i - 1; k++)
				{
					if (a[k] / a[j] == 2 && a[k] % a[j] == 0 || a[j] % a[k] == 0 && a[j] / a[k] == 2)
					{
						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
			count = 0;
		}
		return 0;
	}

}

