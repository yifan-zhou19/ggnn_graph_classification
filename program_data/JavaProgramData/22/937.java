package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int i = 1;
		int m;
		int max;
		int max2 = 0;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		max = a[1];
		while (b == ',')
		{
			i++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				b = tempVar4.charAt(0);
			}
			if (max < a[i])
			{
			max = a[i];
			}
		}
		for (m = 1;m <= i;m++)
		{
			if (a[m] == max)
			{
			continue;
			}
			else
			{
				max2 = a[m];
			}
		}
		if (max2 == 0)
		{
		System.out.print("No");
		}
		else
		{
			for (m = 1;m <= i;m++)
			{
				if (a[m] == max)
				{
				continue;
				}
				else
				{
					if (max2 < a[m])
					{
					max2 = a[m];
					}
				}
			}
			System.out.printf("%d",max2);
		}
		return 0;
	}
}

