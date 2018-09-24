package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int h;
		int g;
		int n;
		int sign;
		for (i = 1; ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == -1)
			{
				break;
			}
		}
		for (j = 1; j <= i - 1; j++)
		{
			if (a[j] == 0)
			{
				for (k = j - 1; k >= 1; k--)
				{
					if (a[k] == 0)
					{
						break;
					}
				}
				sign = 0;
				for (h = k + 1; h < j; h++)
				{
					for (g = k + 1; g < j; g++)
					{
						if (a[h] == 2 * a[g])
						{
							sign++;
						}
					}
				}
				System.out.print(sign);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

