package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int count = 0;
		int[] a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		for (i = 0;i <= n - 1;i++)
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
		for (i = 0;i <= n - 1 - count;i++)
		{
			if (a[i] == k)
			{
				count++;
				for (j = i + 1;j <= n - count;j++)
				{
					a[j - 1] = a[j];
				}
				i--;
			}
			/*printf("count=%d %d\n",count,a[i]);*/
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1 - count;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

