package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[40];
		int[] mirror = new int[40];
		num[39] = 1;
		mirror[39] = 1;
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= n; i++)
			{
				for (k = 39; k >= 0; k--)
				{
					num[k] = num[k] + mirror[k];
					if (num[k] >= 10)
					{
						num[k] = num[k] - 10;
						num[k - 1]++;
					}
				}
				for (k = 0; k <= 39; k++)
				{
					mirror[k] = num[k];
				}
			}
			k = 0;
			while (num[k] == 0)
			{
				k++;
			}
			for (k; k <= 39; k++)
			{
				System.out.print(num[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

