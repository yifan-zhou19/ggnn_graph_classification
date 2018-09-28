package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int r = 0;
		int t;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int maxb;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] < a[i])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
		maxb = b[0];
		for (i = 0;i < n - 1;i++)
		{
			if (maxb < b[i])
			{
				maxb = b[i];
			}
			if (maxb < a[i + 1])
			{
				System.out.print("no");
				r = 1;
				break;
			}
		}
		if (r == 0)
		{
			System.out.printf("%d %d",a[0],maxb);
		}
		return 0;
	}
}

