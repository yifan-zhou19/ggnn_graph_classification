package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int l;
		int sum;
		int[] a = new int[100001];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
						if (a[i] == k)
						{
								   sum++;
						}
		}
		for (i = 0;i < n;i++)
		{
						for (j = 1;j <= 100;j++)
						{
											 if (a[i] == k)
											 {
														for (l = i;l < n - 1;l++)
														{
																		a[l] = a[l + 1];
														}
											 }
						}
		}
		if (a[0] != k)
		{
				   System.out.printf("%d",a[0]);
		}
		for (i = 1;i < n - sum;i++)
		{
						   System.out.printf(" %d",a[i]);
		}
		return 0;
	}
}

