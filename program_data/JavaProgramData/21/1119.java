package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int n;
		int s;
		float sum = 0F;
		float aver;
		float demin;
		float demax;
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
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
			s = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i] > a[j])
				{
					s++;
				}
			}
			b[s] = a[i];
		}
		aver = sum / n;
		demin = aver - b[0];
		demax = b[n - 1] - aver;
		if (demin == demax)
		{
			System.out.printf("%d,%d",b[0],b[n - 1]);
		}
		if (demin > demax)
		{
			System.out.printf("%d",b[0]);
		}
		if (demin < demax)
		{
			System.out.printf("%d",b[n - 1]);
		}
		return 0;
	}


}

