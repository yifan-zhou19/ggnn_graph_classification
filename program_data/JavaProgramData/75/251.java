package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] start = new int[1001];
		int[] end = new int[1001];
		int[] sum = new int[10001];
		int i;
		int j;
		int k;
		int max1;
		int max2;
		char c;
		for (i = 0;c != '\n';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				start[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}
		for (c = 'p',i = 0;c != '\n';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				end[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		for (k = 0;k < i;k++)
		{
			for (j = start[k];j < end[k];j++)
			{
				sum[j]++;
			}
		}
		for (k = 0,max1 = end[0];k < i;k++)
		{
			if (end[k] > max1)
			{
			max1 = end[k];
			}
		}
		for (k = 0,max2 = sum[0];k < max1;k++)
		{
			if (max2 < sum[k])
			{
			max2 = sum[k];
			}
		}
		System.out.printf("%d %d",i,max2);
		return 0;
	}

}

