package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t = 0;
		int r = 0;
		int n;
		int e = 0;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = n - 1;i > 0;i--)
		{
			e = 0;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					e = 1;
				}
			}
			if (e == 0)
			{
				b[t] = a[i];
				t = t + 1;
				r = t;
			}
		}
		System.out.printf("%d",a[0]);
			for (t = r - 1;t >= 0;t--)
			{
			 System.out.printf(",%d",b[t]);
			}
			System.out.print("\n");
			return 0;
	}

}

