package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n;i < 100;i++)
		{
			a[i] = 0;
		}

		for (i = 0;i < n - m;i++)
		{
			temp = a[i];
			a[i] = a[i + n];
			a[i + n] = temp;
		}
		for (i = n - m;i < 2 * n - m - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
			  System.out.printf("%d",a[2 * n - m - 1]);

	return 0;
	}

}

