package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] h = new int[25];
		int[] num = new int[25];
		int k;
		int n;
		int i;
		int j;
		int max;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
			num[i] = 0;
		}
		for (i = 0; i < n; i++)
		{
			k = 0;
			flag = 0;
			for (j = 0; j < i; j++)
			{
				if (h[j] >= h[i])
				{
					if (flag == 0)
					{
						k = j;
						flag = 1;
					}
					else if (num[j] > num[k])
					{
						k = j;
					}
				}
			}
			if (flag != 0)
			{
				num[i] = num[k] + 1;
			}
			else
			{
				num[i] = 1;
			}
		}
		max = 0;
		for (i = 0; i < n; i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.printf("%d\n",max);
	}

}

