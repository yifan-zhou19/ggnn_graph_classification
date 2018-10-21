package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		int j;
		int k = 0;
		int[] a = new int[1000];
		int ex;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x <= 140 && x >= 90 && y <= 90 && y >= 60)
			{
				a[k]++;
			}
			else
			{
				k++;
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		if (x <= 140 && x >= 90 && y <= 90 && y >= 60)
		{
			a[k]++;
			k++;
		}
		else
		{
			k++;
		}
		for (i = 0;i < k;i++)
		{
			if (a[0] < a[i])
			{
				ex = a[0];
				a[0] = a[i];
				a[i] = a[0];
			}
		}
		System.out.printf("%d\n",a[0]);
		return 0;
	}


}

