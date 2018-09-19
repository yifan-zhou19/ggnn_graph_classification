package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int i;
		while (true)
		{
			int n = 1;
			int sum = 0;
			int j;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			while ((a[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				if (a[n] == 0)
				{
					break;
				}
				n++;
			}
			for (i = 0; i < n - 1; i++)
			{
				for (j = i + 1; j < n; j++)
				{
					if (a[i] == a[j] * 2 || a[j] == a[i] * 2)
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

