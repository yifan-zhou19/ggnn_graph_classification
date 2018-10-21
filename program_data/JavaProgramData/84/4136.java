package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int n;
		int[] a = new int[300];
		int temp;
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
		for (i = 0;i < n - 1;i++)
		{
			for (k = 0;k < n - i - 1;k++)
			{
				if (a[k] > a[k + 1])
				{
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
				System.out.printf("%d\n%d\n",a[n - 1],a[n - 2]);
	}
}

