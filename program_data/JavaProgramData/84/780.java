package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (a[1] < a[2])
		{
			e = a[1];
			a[1] = a[2];
			a[2] = a[1];
		}
		else
		{
		}
		for (i = 3;i <= n;i++)
		{
			if (a[i] > a[1])
			{
				e = a[1];
				a[1] = a[i];
				a[2] = e;
			}
			else if (a[i] < a[2])
			{
			}
			else
			{
				a[2] = a[i];
			}
		}
		System.out.printf("%d\n%d\n",a[1],a[2]);
		return 0;
	}
}

