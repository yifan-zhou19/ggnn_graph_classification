package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] height = new int[30];
		int[] num = new int[30];
		int j;
		int max = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			height[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			num[i] = 1;
		}


		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j >= 0 ;j--)
			{
				if (height[j] >= height[i] != 0 && num[j] + 1 > num[i])
				{
					num[i] = num[j] + 1;
				}


			}
		}
		for (i = 1;i < n;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");


	}

}

