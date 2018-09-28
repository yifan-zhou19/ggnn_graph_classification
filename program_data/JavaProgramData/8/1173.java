package <missing>;

public class GlobalMembers
{
	public static void sca(int n, int l)
	{
	int i;
	int j;
	int[] a = new int[100];
	int p;
	for (i = 0;i < n;i = i + 1)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		for (j = i;j > 0;j = j - 1)
		{
			if (a[j] < a[j - 1])
			{
				p = a[j];
				a[j] = a[j - 1];
				a[j - 1] = p;
			}
		}
	}
	for (i = 0;i < n - 1;i = i + 1)
	{
		System.out.printf("%d ",a[i]);
	}
	 if (l == 1)
	 {
		 System.out.printf("%d ",a[n - 1]);
	 }
	 else
	 {
		 System.out.printf("%d",a[n - 1]);
	 }
	}
	public static int Main()
	{
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		sca(n1, 1);
		sca(n2, 2);
	}
}

