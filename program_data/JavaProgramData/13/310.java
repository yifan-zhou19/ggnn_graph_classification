package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int[] b = new int[20000];
		int n;
		int i;
		int m;
		int p = 0;
		int l;
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
			for (m = 0;m < i;m++)
			{
				if (a[i] == a[m])
				{
					break;
				}
			}
			if (m == i)
			{
				p = p + 1;
				b[p] = a[i];
			}

		}
		for (l = 1;l <= p;l++)
		{
			if (l == p)
			{
				System.out.printf("%d",b[l]);
			}
			else
			{
				System.out.printf("%d ",b[l]);
			}
		}
		return 0;

	}

}

