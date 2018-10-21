package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j = 0;
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
		for (i = 0;i < n;i++)
		{
						 if (a[i] % 2 != 0)
						 {
									   b[j] = a[i];
									   j++;
						 }
		}
		sort(b,b + j);
		for (i = 0;i < j - 1;i++)
		{
		System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j - 1]);

	}
}

