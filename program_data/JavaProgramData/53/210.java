package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300];
		int[] copy = new int[300];
		int sNum;
		int i;
		int count = 0;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sNum = Integer.parseInt(tempVar);
		}
		for (i = 0;i < sNum; i++)
		{
			flag = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < i;j++)
			{
				if (num[i] == copy[j])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
					copy[count] = num[i];
					count++;
			}
		}

		for (j = 0;j < count;j++)
		{
			System.out.printf("%d",copy[j]);
			if (j < count - 1)
			{
				System.out.print(",");
			}
		}
	System.out.print("\n");
	return 0;
	}

}

