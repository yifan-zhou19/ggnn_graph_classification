package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[16];
		int i = 0;
		int j = 0;
		int sum = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[0] = Integer.parseInt(tempVar);
			}
			if (num[0] == -1)
			{
				break;
			}
			for (i = 1;num[i - 1] != 0;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;num[i] != 0;i++)
			{
				for (j = 0;num[j] != 0;j++)
				{
					if ((num[i] == 2 * num[j]) && (num[i] != 0) && (num[j] != 0))
					{
					sum++;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;

		}
		return 0;
	}
}

