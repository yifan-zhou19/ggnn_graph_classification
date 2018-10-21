package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		int m;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] j = new int[n];
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			j[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] <= 90 && b[i] >= 60)
			{
				j[k]++;
			}
			else
			{
				k++;
			}
		}
		 for (k = 0;k < n;k++)
		 {
				if (j[0] < j[k])
				{
					j[0] = m;
					j[0] = j[k];
					j[k] = m;
				}
		 }
		System.out.printf("%d\n",j[0]);
		return 0;
	}





}

