package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int s;
		int sum;
		int[] num = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		for (i = 0;i < sum;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < sum;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (num[i] == num[j])
				{
					num[i] = 0;
					break;
				}
			}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i < sum;i++)
		{
			if (num[i] == 0)
			{
				continue;
			}
			else
			{
				System.out.printf(" %d",num[i]);
			}
		}
	}
}

