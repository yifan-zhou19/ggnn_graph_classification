package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i = 0;
		int j = 0;
		int k = 0;
		int t1 = 0;
		int t2 = 0;
		int sum = 0;
		int n;
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

		for (i = n - 1;i >= 0;i--)
		{
			if (i != 0)
			{
			System.out.printf("%d ",a[i]);
			}
			else
			{
			System.out.printf("%d",a[i]);
			}
		}

		return 0;
	}
}

