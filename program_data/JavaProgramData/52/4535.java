package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int b;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a[i] = Integer.parseInt(tempVar4);
		}
		}
		b = n - m;
		for (i = 0; i < n - 1; i++)
		{
		System.out.printf("%d ", a[(i + b) % n]);
		}
		System.out.printf("%d",a[n - m - 1]);
	}

}

