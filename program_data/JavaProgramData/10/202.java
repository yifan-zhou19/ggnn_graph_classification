package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] h = new int[26];
		int[] f = new int[26];
		int i = 0;
		int j = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f[0] = 0;
		h[0] = 0;
		int max = 0;
		for (i = 1;i <= n;i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			max = 0;
			for (j = i - 1;j > 0;j--)
			{
				if (h[i] <= h[j] != 0 && max < f[j] + 1)
				{
					max = f[j];
				}
			}
			f[i] = max + 1;
		}
		max = 0;
		for (i = 1;i <= n;i++) //?????????????????????
		{ //????? ????????
			if (max < f[i])
			{
				max = f[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

