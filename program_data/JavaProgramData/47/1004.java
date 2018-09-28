package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int b;
		int i;
		i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[n] = Integer.parseInt(tempVar3);
		}
		i = 1;
		while (i <= n / 2)
		{
			b = a[n - i + 1];
			a[n - i + 1] = a[i];
			a[i] = b;
			i++;
		}
		i = 1;
		while (i < n)
		{
			System.out.printf("%d ",a[i]);
			i++;
		}
		System.out.printf("%d",a[n]);
		return 0;
	}
}

