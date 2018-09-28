package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		System.out.printf("%d",b[0]);
		j = 0;
		for (i = 1;i < n;i = i + 1)
		{
			for (k = 0;k <= j;k = k + 1)
			{
				if (a[i] == b[k])
				{
					break;
				}
			}
			if (k > j)
			{
				j = j + 1;
				b[j] = a[i];
				System.out.printf(",%d",b[j]);
			}
		}
	}
}

