package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
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
		int[] a = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		System.out.printf("%d",a[n - m]);
		for (i = n - m + 1;i < n;i++)
		{
		System.out.printf(" %d",a[i]);
		}
		for (i = 0;i < (n - m);i++)
		{
		System.out.printf(" %d",a[i]);
		}
		System.in.read();
		System.in.read();
	}
}

