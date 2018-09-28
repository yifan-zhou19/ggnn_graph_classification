package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int f = 0;
		int[] a = new int[300];
		int m = 1;
		int[] b = new int[300];
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
		System.out.printf("%d,",a[0]);
		for (i = 1;i < n;i++)
		{
			f = 0;
			for (j = i - 1;j >= 0;j--)
			{

				if (a[i] == a[j])
				{
					f++;
				}
			}
			if (f != 0)
			{
				continue;
			}

			if (f == 0)
			{
				b[m] = a[i];
				m++;
			}

		}
		for (i = 1;i < m - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[m - 1]);
		return 0;
	}

}

