package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int[] num = new int[16];
		int count = 0;
		int key = 0;
		num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num[0] != -1)
		{
			for (i = 0;num[i] != 0;i++)
			{
				num[i + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			count = i;
			key = 0;
			for (i = 0;i < count;i++)
			{
				for (j = i;j < count;j++)
				{
					if (num[i] == 2 * num[j] || num[j] == 2 * num[i])
					{
						key++;
					}
				}
			}
			System.out.print(key);
			System.out.print("\n");
			for (i = 0;i < 16;i++)
			{
				num[i] = 0;
			}
			num[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

