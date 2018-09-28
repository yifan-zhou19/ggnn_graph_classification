package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[50];
		int[] num0 = new int[50];
		int i;
		int j;
		int k = 1;
		num[0] = 1;
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j < k; j++)
			{
				num[j] = num[j] * 2;
				num0[j] = num[j] / 10;
				num[j] = num[j] % 10;
			}
			for (j = 0; j < k; j++)
			{
				num[j + 1] += num0[j];
			}
			if (num[k] != 0)
			{
					k++;
			}
		}
		for (i = k - 1; i >= 0; i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

