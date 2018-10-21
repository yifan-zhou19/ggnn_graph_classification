package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int i;
		int j;
		int k;
		int temp;
		j = 0;
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
				k = Integer.parseInt(tempVar2);
			}
			if (k % 2 == 1)
			{
				a[j] = k;
				j++;
			}
		}
		for (i = j - 1;i >= 0;i--)
		{
			for (k = 0;k < i;k++)
			{
				if (a[k] > a[k + 1])
				{
					temp = a[k + 1];
					a[k + 1] = a[k];
					a[k] = temp;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[j - 1]);
		return 0;
	}

}

