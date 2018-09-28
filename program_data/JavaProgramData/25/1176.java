package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[50];
		num[1] = 2;
		for (i = 1;i < n;i++)
		{
			k = 49;
			while (num[k] == 0)
			{
				k--;
			}
			for (j = 1;j <= k + 1;j++)
			{
				num[j] *= 2;
				if (num[j - 1] >= 10)
				{
					num[j - 1] -= 10;
					num[j]++;
				}
			}
		}
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			k = 49;
			while (num[k] == 0)
			{
				k--;
			}
			for (i = k;i > 0;i--)
			{
				System.out.print(num[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

