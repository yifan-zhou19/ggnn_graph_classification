package <missing>;

public class GlobalMembers
{
	public static void change(int n, int[] a)
	{
		int i;
		for (i = n - 1;i >= 1;i--)
		{
			a[i - 1] = a[i - 1] + a[i];
			a[i] = a[i - 1] - a[i];
			a[i - 1] = a[i - 1] - a[i];
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[100];
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

		int i;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 1;i <= m;i++)
		{
			change(n, a);
		}

		for (i = 0;i <= n - 2;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n - 1]);
	}
}

