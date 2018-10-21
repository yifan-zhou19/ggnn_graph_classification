package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i - 1] = Integer.parseInt(tempVar2);
		}
		}
		for (i = n - 1;i >= 1;i--)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[0]);

	}

}

