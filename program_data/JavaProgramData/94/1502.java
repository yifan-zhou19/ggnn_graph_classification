package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j = 0;
		int c;
		int l;
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
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (l = i + 1;l < j;l++)
			{
				if (b[i] > b[l])
				{
					c = b[i];
					b[i] = b[l];
					b[l] = c;
				}
			}
		}
			System.out.printf("%d",b[0]);
		for (l = 1;l < j;l++)
		{
			System.out.printf(",%d",b[l]);
		}
	return 0;
	}

}

