package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int diyi;
		int dier;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		diyi = a[0];
		dier = a[1];
		for (i = 1;i <= n - 1;i++)
		{
			if (a[i] >= diyi)
			{
				dier = diyi;
				diyi = a[i];
			}
			if (a[i] < diyi && a[i] >= dier)
			{
			dier = a[i];
			}
		}
		System.out.printf("%d\n%d",diyi,dier);
		return 0;
	}
}

