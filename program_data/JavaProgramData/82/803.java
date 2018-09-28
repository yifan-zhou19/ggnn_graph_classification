package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int k = 0;
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				k++;
				c[i] = k;
			}
			else
			{
				c[i] = k = 0;
			}
		}
			max = c[0];
			for (i = 0;i < n;i++)
			{
				if (max < c[i])
				{
					max = c[i];
				}
			}
			System.out.printf("%d",max);
			return 0;
	}

}

