package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		int[] hei = new int[30];
		int[] max = new int[30];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;i++)
		{
			hei[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			max[i] = 1;
		}
		for (i = 0; i < n;i++)
		{
			num = 0;
			for (j = 0; j < i ;j++)
			{
				if (hei[j] >= hei[i])
				{
					if (max[j] > num)
					{
						num = max[j];
					}
				}
			}
			max[i] = num + 1;
		}
		num = 0;
		for (i = 0;i < n;i++)
		{
			if (max[i] > num)
			{
				num = max[i];
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

