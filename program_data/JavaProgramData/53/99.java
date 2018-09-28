package <missing>;

public class GlobalMembers
{
	public static int[] count = new int[10000];

	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] num = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0; i < k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < k; i++)
		{
			if (count[num[i]] == 0)
			{
				count[num[i]] = 1;
				System.out.printf("%d",num[i]);
				break;
			}
		}
		for (; i < k; i++)
		{
			if (count[num[i]] == 0)
			{
				count[num[i]] = 1;
				System.out.printf(",%d",num[i]);
			}
		}

		return 0;
	}
}

