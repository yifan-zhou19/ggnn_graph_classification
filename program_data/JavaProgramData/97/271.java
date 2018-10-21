package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] data = {100, 50, 20, 10, 5, 1};
		int[] num = new int[6];
		int sum;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			for (;;)
			{
				if (sum - data[i] >= 0)
				{
					sum = sum - data[i];
					num[i]++;
				}
				else
				{
					break;
				}
			}

			System.out.printf("%d\n",num[i]);
		}

	}


}

