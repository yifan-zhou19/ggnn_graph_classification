package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] a = new int[20000];
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		int j;
		int tag = 0;
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			tag = 0;
			for (j = 0;j <= i - 1;j++)
			{
				if (a[j] == a[i])
				{
					tag++;
				}
			}
		if (tag == 0)
		{
			System.out.printf(" %d",a[i]);
		}
		}



	}

}

