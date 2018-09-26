package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		int time;
		int k;
		int[] a = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			time = 0;
			count = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			if (k == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < k;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < k;j++)
				{
					count = a[j];
					time = count + 3 * j;
					if (time >= 57)
					{
						break;
					}
				}
				if (time >= 57 && time <= 60)
				{
					System.out.printf("%d\n",count);
				}
				else if (time > 60)
				{
					count = count - (time-60);
					System.out.printf("%d\n",count);
				}
				else if (time < 57)
				{
					count = count + 57 - time;
					System.out.printf("%d\n",count);
				}
			}

		}
		return 0;
	}
}

