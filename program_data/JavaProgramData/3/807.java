package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int tag = 0;
		int[] num = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (num[i] + num[j] == k)
				{
					tag = 1;
					break;
				}
			}
			if (tag != 0)
			{
				System.out.print("yes");
				break;
			}
		}
		if (tag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

