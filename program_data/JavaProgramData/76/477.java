package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[50000];
		int[] b = new int[50000];
		int k;
		int i;
		int e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
			}
		}
		s = 0;
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] >= a[i + 1])
			{
				s++;
			   if (b[i] > b[i + 1])
			   {
			   b[i + 1] = b[i];
			   }
			}
		}
		if (s == n - 1)
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

