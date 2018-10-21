package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n)
	{
		int i;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > a[k])
			{
				k = i;
			}
		}
		i = a[k];
		a[k] = 0;
		return i;

	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("\n%d",max(a, n));
		System.out.printf("\n%d",max(a, n));
		return 0;
	}


}

