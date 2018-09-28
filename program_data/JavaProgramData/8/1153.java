package <missing>;

public class GlobalMembers
{
	public static void changeplace(int n, int[] a)
	{
		int i;
		int j;
		int x;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] >= a[j + 1])
				{
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
				}
			}

		}
	}
	public static int Main()
	{
		int n1;
		int n2;
		int k;
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
		int[] p = new int[n1];
		int[] q = new int[n2];
		for (k = 0;k < n1;k++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[k] = Integer.parseInt(tempVar3);
		}
		}
		for (k = 0;k < n2;k++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			q[k] = Integer.parseInt(tempVar4);
		}
		}
		changeplace(n1, p);
		changeplace(n2, q);
		for (k = 0;k < n1;k++)
		{
		System.out.printf("%d ",p[k]);
		}
		for (k = 0;k < n2 - 1;k++)
		{
		System.out.printf("%d ",q[k]);
		}
		System.out.printf("%d",q[n2 - 1]);


	}
}

