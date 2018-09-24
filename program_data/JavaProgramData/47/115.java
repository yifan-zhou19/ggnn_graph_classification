package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] a;
		int[] b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[n - i - 1];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d\n",b[n - 1]);
		return;
	}


}

