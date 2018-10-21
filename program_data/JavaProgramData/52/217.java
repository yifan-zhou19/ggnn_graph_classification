package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n;i < 2 * n - m;i++)
		{
		 a[i] = a[i - n];
		}
		System.out.printf("%d",a[n - m]);
		for (i = n - m + 1;i < 2 * n - m;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	   System.out.print("\n");
	}
}

