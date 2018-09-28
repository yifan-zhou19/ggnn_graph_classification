package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int e;

		int[] a = new int[500];
		int[] b = new int[500];
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
		j = 0;
		for (i = 0;i < n;i++)
		{
						if (!(a[i] % 2 == 0))
						{
									 b[j] = a[i];
									 j++;
						}
		}

		for (i = 0;i < j;i++)
		{
						for (k = i;k < j;k++)
						{
										if (b[k] < b[i])
										{
													 e = b[k];
													 b[k] = b[i];
													 b[i] = e;
										}
						}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < j;i++)
		{
						System.out.printf(",%d",b[i]);
		}

		return 0;
	}
}

