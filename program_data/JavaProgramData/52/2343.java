package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] a = new int[100];
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] num = a;
		for (i = n - m + 1;i <= n;i++)
		{
			k = (num + i);
			System.out.printf("%d",k);
			System.out.print(" ");
		}
		for (i = 1;i <= n - m - 1;i++)
		{
			k = (num + i);
			System.out.printf("%d",k);
			System.out.print(" ");
		}
		System.out.printf("%d",a[n - m]);
		return 0;
	}
}

