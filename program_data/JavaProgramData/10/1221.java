package <missing>;

public class GlobalMembers
{
	public static int[] sta = new int[20002];
	public static int mycmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int[] input = new int[30];
		int[] cnt = new int[30];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
			input[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		cnt[0] = 1;
		for (i = 1;i < n;i++)
		{
			int max = 0;
			for (int k = i - 1;k >= 0;k--)
			{
				if (cnt[k] > max && input[k] >= input[i])
				{
					max = cnt[k];
				}
			}
			cnt[i] = max + 1;
		}
		int m = 0;
		for (i = 0;i < n;i++)
		{
			if (m < cnt[i])
			{
				m = cnt[i];
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}




}

