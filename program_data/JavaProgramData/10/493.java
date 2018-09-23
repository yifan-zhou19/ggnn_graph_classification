package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] h = new int[26];
		int[] ans = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Integer.SIZE / Byte.SIZE));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;++i)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ans[i] = 1;
		}
		for (i = 1;i < k;++i)
		{
			for (j = i - 1;j >= 0;--j)
			{
				if (h[j] >= h[i] != 0 && ans[j] + 1 > ans[i])
				{
					ans[i] = ans[j] + 1;
				}
			}
		}
				int max = 0;
		for (i = 0;i < k;++i)
		{
			if (ans[i] > max)
			{
				max = ans[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

