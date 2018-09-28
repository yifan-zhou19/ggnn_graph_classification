package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
		while (n != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0] = Integer.parseInt(tempVar2);
			}
			for (i = 1;i < n;i++)
			{
				a[i] = a[i - 1];
			}
			n--;
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[m - 1]);
		return 0;
	}
}

