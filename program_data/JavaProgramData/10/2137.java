package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[30];
		int[] len = new int[30];
		for (int i = 0;i < n;++i)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		len[0] = 1;
		for (int i = 1;i < n;++i)
		{
			int max = 0;
			for (int j = 0;j < i;++j)
			{
				if (num[j] >= num[i] != 0 && len[j] > max)
				{
					max = len[j];
				}
				if (max == 0)
				{
					len[i] = 1;
				}
				else
				{
					len[i] = max + 1;
				}
			}
		}
		int l = len[0];
		for (int i = 1;i < n;++i)
		{
			if (len[i] > l)
			{
				l = len[i];
			}
		}
		System.out.print(l);
		System.out.print("\n");
	}
}

