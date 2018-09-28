package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max1;
		int max2;
		int i;
		int[] num = new int[100];
		max1 = 0;
		max2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num[1] = Integer.parseInt(tempVar3);
		}
		if (num[0] >= num[1])
		{
			max1 = num[0];
			max2 = num[1];
		}
		else
		{
			max1 = num[1];
			max2 = num[0];
		}
		for (i = 2; i < n; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num[i] = Integer.parseInt(tempVar4);
			}
			if (num[i] > max1)
			{
				max2 = max1;
				max1 = num[i];
			}
			else if (num[i] > max2)
			{
				max2 = num[i];
			}
			else
			{
				continue;
			}
		}
			System.out.printf("%d\n%d\n", max1,max2);
			return 0;
	}
}

