package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int k;
		int i;
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		for (i = 0;i < k;i++)
		{
			b[i] = 1;
			for (j = 0;j < i;j++)
			{
				if (a[j] >= a[i] != 0 && b[j] + 1 > b[i])
				{
					b[i] = b[j] + 1;
				}
			}
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		System.out.printf("%d",m);
	}
}

