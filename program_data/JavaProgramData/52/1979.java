package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n; //n??????m??????
		int m;
		int i;
		int p;
		int[] a = new int[201];
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		for (i = n - m;i < n;i++)
		{
			a[100 + p] = a[i];
			p = p + 1;
		}
		for (i = n - 1;i >= m;i--)
		{
			a[i] = a[i - m];
		}
		for (i = 0;i < m;i++)
		{
			a[i] = a[100 + i];
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}

	}
}

