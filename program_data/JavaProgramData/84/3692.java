package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int k = a[0];
		int b = a[0];
		for (i = 0;i < n;i++)
		{
			if (k < a[i])
			{
				k = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b < a[i] && a[i] != k)
			{
				b = a[i];
			}
		}
		System.out.printf("%d\n%d\n",k,b);
		return 0;
	}

}

