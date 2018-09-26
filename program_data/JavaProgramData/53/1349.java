package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int k;
		int s;
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
		for (i = 1;i <= n;i++)
		{
			for (k = i + 1;k <= n;k++)
			{
				if (a[k] == a[i])
				{
					a[k] = 324235;
				}
			}
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 324235)
			{
				k += 1;
			}
		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 324235 && s == k - 1)
			{
				System.out.printf("%d",a[i]);
				break;
			}
			if (a[i] != 324235)
			{
				System.out.printf("%d,",a[i]);
			s++;
			}
		}
		return 0;
	}


}

