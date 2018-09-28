package <missing>;

public class GlobalMembers
{
	public static void change(int n, int m, int[] a)
	{
		int[] b = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i];
		}
		for (i = n - m;i < n;i++)
		{
			a[i - n + m] = a[i];
		}
		for (i = m;i < n;i++)
		{
			a[i] = b[i - m];
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
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
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		change(n, m, a);
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

