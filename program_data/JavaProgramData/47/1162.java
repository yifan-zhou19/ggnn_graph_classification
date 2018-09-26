package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int j;
		int e;
		int m;
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
		for (j = 0;j < (n / 2);j++)
		{
			e = a[j];
			a[j] = a[n - 1 - j];
			a[n - 1 - j] = e;
			System.out.printf("%d ",a[j]);
		}
		for (m = n / 2;m < n - 1;m++)
		{
			System.out.printf("%d ",a[m]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}

}

