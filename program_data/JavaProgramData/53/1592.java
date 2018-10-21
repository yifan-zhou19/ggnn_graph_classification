package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[300];
		int n;
		int i;
		int j;
		int q;
		int k;
		int[] d = new int[300];
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
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		d[0] = x[0];
		k = 1;
		for (i = 0;i < n;i++)
		{
			q = 0;
			for (j = 0;j < k;j++)
			{
				if (x[i] == d[j])
				{
					q++;
				}
			}
			if (q == 0)
			{
				d[k] = x[i];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",d[i]);
		}
		return 0;
	}

}

