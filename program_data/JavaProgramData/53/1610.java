package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int k = 0;
		int i;
		int j;
		int x;
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
			x = 0;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					x = x + 1;
				}
			}
			if (x == 0)
			{
				b[k] = a[i];
				k = k + 1;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		return 0;
	}

}

