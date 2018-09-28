package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int n;
		int m;
		int i;
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
		i = 1;
		while (i <= n)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			i = i + 1;
		}
		i = 1;
		while (i <= n - m)
		{
			a[n + i] = a[i];
			i = i + 1;
		}
		i = (n - m) + 1;
		while (i <= n + (n - m))
		{
			a[i - (n - m)] = a[i];
			i = i + 1;
		}
		System.out.printf("%d",a[1]);
		i = 2;
		while (i <= n)
		{
			System.out.printf(" %d",a[i]);
			i = i + 1;
		}
	}
}

