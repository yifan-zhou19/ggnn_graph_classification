package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		int n;
		int i;
		int d = 0;
		int k;
		int[] a = new int[1001];
		int s;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			l = 0;
			for (k = 1;k <= n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[k] = Integer.parseInt(tempVar2);
				}
				if (a[k] == 0)
				{
					l++;
				}
			}
			if (l != 0)
			{
				break;
			}
		}
		for (i = i + 1;i <= n;i++)
		{
			int m = 0;
			for (k = 1;k <= n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[k] = Integer.parseInt(tempVar3);
				}
				if (a[k] == 0)
				{
					m++;
				}
			}
			if (m != 0)
			{
				d++;
			}
			else
			{
				break;
			}
		}
		s = (d - 1) * (l - 2);
		System.out.printf("%d",s);
	}
}

