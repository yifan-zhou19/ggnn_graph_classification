package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] h = new int[25];
		int[] len = new int[25];
		int i;
		int j;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k; i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		len[0] = 1;
		int ans = 1;
		for (i = 1; i < k; i++)
		{
			/*if(h[i] <= h[i - 1])
				len[i] = len[i - 1] + 1;
			else
				len[i] = 1;
			if(len[i] > ans)
				ans = len[i];*/
			int temp = -1;
			int tIndex = -1;
			for (j = 0; j < i; j++)
			{
				if (h[j] >= h[i])
				{
					if (len[j] > temp)
					{
						temp = len[j];
						tIndex = j;
					}
				}
			}
			if (temp == -1)
			{
				len[i] = 1;
			}
			else
			{
				len[i] = len[tIndex] + 1;
			}
			if (len[i] > ans)
			{
				ans = len[i];
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

