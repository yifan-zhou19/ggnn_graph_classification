package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[20000];
		int i;
		int j;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			int k;
			k = 0;
			for (j = 1;j <= i - 1;j++)
			{
			  if (a[i] != a[j])
			  {
				  k = k + 0;
			  }
			  else
			  {
				  k = k + 1;
			  }
			}
			if (k == 0 && a[i] != a[0])
			{
				System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}
}

