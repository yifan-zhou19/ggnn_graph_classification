package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int count;
		int[] a = new int[60];
		int time;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			count = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (k = 1;k <= 60;k++)
			{
				time = 1;
				for (j = 0;j < m;j++)
				{
					if (k == a[j])
					{
						time = 4;
						break;
					}
				}
				count += time;
				if (count >= 60)
				{
					break;
				}
			}
			System.out.printf("%d\n",k);
		}
	}

}

