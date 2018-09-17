package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[26];
		int[] r = new int[26];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		for (int i = 0;i < 26;i++)
		{
			r[i] = 1;
		}
		for (int i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 0;i < k;i++)
		{
			if (i == 0)
			{
				r[i] = 1;
			}
			else
			{
				for (int j = 0; j < i;j++)
				{
					if (a[j] >= a[i] != 0 && r[j] >= r[i])
					{
						r[i] = r[j] + 1;
					}
				}
			}
		}
		int s = 0;
		for (int i = 0; i < k;i++)
		{
			if (r[i] > s)
			{
				s = r[i];
			}
		}
		System.out.print(s);
		System.out.print("\n");

		return 0;
	}
}

