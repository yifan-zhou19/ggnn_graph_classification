package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int[] start = new int[1000];
		int[] end = new int[1000];
		char c = ',';
		while (c != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				start[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n++;
		}

		int i;
		for (i = 0;i <= n - 1;i++)
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

		int time = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (time < end[i])
			{
				time = end[i];
			}
		}

		int[] member = new int[1000];
		int j;

		for (i = 0;i <= time-1;i++)
		{
			member[i] = 0;
		}

		for (i = 0;i <= n - 1;i++)
		{
			for (j = start[i];j < end[i];j++)
			{
				member[j - 1]++;
			}
		}

		int max = 0;
		for (i = 0;i <= time-1;i++)
		{
			if (max < member[i])
			{
				max = member[i];
			}
		}

		System.out.printf("%d %d\n",n,max);
	}


}

