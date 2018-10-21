package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int[] height = new int[25];
		int[] len = new int[25];
		int[] num = new int[25];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			height[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			len[i] = 0;
		}
		for (i = n - 1;i >= 0;i--)
		{
			m = 0;
			for (j = i + 1;j <= n - 1;j++)
			{
				if (height[j] <= height[i])
				{
					num[m] = j;
					m++;
				}
			}
			for (k = 0;k <= m - 1;k++)
			{
				if (len[i] < len[num[k]])
				{
					len[i] = len[num[k]];
				}
			}
				len[i]++;
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (len[i] > m)
			{
				m = len[i];
			}
		}
			System.out.print(m);
			System.out.print("\n");
	return 0;
	}

}

