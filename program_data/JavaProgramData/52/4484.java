package <missing>;

public class GlobalMembers
{
	public static void move(int[] a, int n, int m)
	{
		int i;
		for (i = n - 1;i >= 0;i--)
		{
			a[i + m] = a[i];
		}
		for (i = n;i < n + m;i++)
		{
			a[i - n] = a[i];
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[200];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		move(a, n, m);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n - 1]);
	}
}

