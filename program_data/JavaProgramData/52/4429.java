package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int change = int;
		int[] a = new int[100];
		int i;
		int m;
		int n;
		int j;
		int t;
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
		for (j = 0;j < m;j++)
		{
			t = a[n - 1];
			for (i = n - 1;i > 0;i--)
			{
			a[i] = a[i - 1];
			}
			a[0] = t;
		}
		 System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}

}

