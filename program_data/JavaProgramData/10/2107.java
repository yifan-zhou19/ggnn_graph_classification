package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static int[] input = new int[26];
	public static int[] state = new int[26];
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n;i++)
		{
			state[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input[i] = Integer.parseInt(tempVar2);
			}
		}
		state[0] = 1;
		for (j = 1;j < n;j++)
		{
			int min = 1;
			for (i = 0;i < j;i++)
			{
				if (input[i] >= input[j])
				{
					if (state[i] + 1 > min)
					{
						min = state[i] + 1;
					}
				}
			}
			state[j] = min;
		}
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			if (state[i] > sum)
			{
				sum = state[i];
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}

}

