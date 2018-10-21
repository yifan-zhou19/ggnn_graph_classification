package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 100;
		int m = 16;
		int i = 1;
		int j;
		int k;
		int t = 0;
		int[] a = new int[16];
		while (n > 0)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == (-1))
			{
				break;
			}
			else
			{
				while (m > 0)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0)
					{
						break;
					}
					m--;
					i++;
				}
				for (j = 0;j <= i - 1;j++)
				{
					for (k = 0;k <= i - 1;k++)
					{
						if (a[j] == 2 * a[k])
						{
							t++;
						}
					}
				}
			}
			System.out.print(t);
			System.out.print("\n");
			t = 0;
			m = 16;
			i = 1;
			n--;
		}
		return 0;
	}
}

