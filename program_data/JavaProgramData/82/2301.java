package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int hour = 0;
		int j = 0;
		int max = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 1)
			{
				for (j = i;j < n;j++)
				{
					if (c[j] == 1)
					{
						hour++;
					}
					else
					{
						break;
					}
				}
			}
			if (hour > max)
			{
				max = hour;
			}
			hour = 0;

		}
		System.out.printf("%d",max);
		return 0;
	}


}

