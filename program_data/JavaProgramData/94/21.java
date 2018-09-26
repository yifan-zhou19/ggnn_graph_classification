package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a;
		int temp;
		int k = 1;
		int[] num = new int[501];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a % 2 == 1)
			{
				for (j = 1; j < k; j++)
				{
					if (a == num[k])
					{
						break;
					}
				}
				if (j == k)
				{
					num[k] = a;
					k++;
				}
			}
		}
		k -= 1;
		for (i = 0; i <= k - 1; i++)
		{
			for (j = 1; j <= k - i - 1; j++)
			{
				if (num[j] > num[j + 1])
				{
					temp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = temp;
				}
			}
		}
		for (i = 1; i < k; i++)
		{
			System.out.print(num[i]);
			System.out.print(",");
		}
		System.out.print(num[k]);
		return 0;
	}
}

