package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		}
		i = 1;
		while (i <= n)
		{
			b[n + 1 - i] = a[i];
			i = i + 1;
		}
		i = 1;
		while (i <= n - 1)
		{
			System.out.printf("%d ",b[i]);
			i = i + 1;
		}
		System.out.printf("%d",b[i]);
	}
}

