package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[1000];
		int i;
		int k;
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
		while (m != 0 && n != 0)
		{
		int j = 1;
		a[0] = 0;
		for (i = 1;i <= n;i++)
		{
		  a[i] = i;
		}
		for (i = 1;i <= n - 1;i++)
		{
		  j = (m + j - 2) % (n - i + 1) + 1;
		  for (k = 1;k <= n - i;k++)
		  {
			if (k >= j)
			{
			  a[k] = a[k + 1];
			}
		  }
		}
		System.out.printf("%d\n",a[1]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		}

		System.in.read();
		System.in.read();
	}
}

