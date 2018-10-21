package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[100];
		int n;
		int e = 0;

		for (i = 0;i < 100;i++)
		{
				 a[i] = 0;
		}

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
			if (a[i] > a[i + 1])
			{
				e = a[i + 1];
				a[i + 1] = a[i];
				a[i] = e;
			}
		}

		for (i = 0;i < n - 2;i++)
		{
			if (a[i] > a[i + 1])
			{
				e = a[i + 1];
				a[i + 1] = a[i];
				a[i] = e;
			}
		}

			 System.out.printf("%d\n%d",a[n - 1],a[n - 2]);
		return 0;
	}
}

