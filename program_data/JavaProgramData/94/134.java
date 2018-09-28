package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num; //num?????i?j?????
		int i;
		int j;
		final int t = n;
		int[] jishu = new int[t]; //????????
		for (i = 1,j = 0;i <= n;i++)
		{ //????????
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 == 1)
			{
				jishu[j] = num;
				j++;
			}
		}
		for (i = j - 2;i > 0;i--) //???????????
		{
			for (int k = 0;k <= i;k++)
			{
				if (jishu[k] > jishu[k + 1])
				{
					int temp = jishu[k + 1];
					jishu[k + 1] = jishu[k];
					jishu[k] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{ //??
			System.out.print(jishu[i]);
			if (!(i == j - 1))
			{
				System.out.print(',');
			}
		}
		return 0;
	}
}

