package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int i;
		int j;
		int n;
		int maxb;
		int num = 0;
		int s;
		int[] a = new int[30];
		int[] b = new int[30];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = 1;
		for (i = 1; i < n; i++)
		{
			max = 0;
			s = 0;
			for (j = 0; j < i; j++)
			{
				if ((a[j] >= a[i]) && (b[j] >= max))
				{
					b[i] = b[j] + 1;
					max = b[j];
					s = 1;
				}
			if (s == 0)
			{
					b[i] = 1;
			}
			}
		}
		maxb = 0;
		for (i = 0; i < n; i++)
		{
			//printf("%d ",b[i]);
			if (b[i] > maxb)
			{
				maxb = b[i];
			}
		}
		System.out.printf("%d\n",maxb);
		return 0;
	}

}

