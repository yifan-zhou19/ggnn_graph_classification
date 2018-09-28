package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		int j;
		int[] a = new int[10000];
		int l = 1;
		int s = 50000;
		int m = 1;
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
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			for (j = p;j < q;j++)
			{
				a[j] = 1;
				if (p < s)
				{
					s = p;
				}
				if (q > l)
				{
					l = q;
				}
			}
		}
		a[s] = 1;
		a[l] = 1;
		for (i = s;i <= l;i++)
		{
			if (a[i] == 0)
			{
				m = 0;
				System.out.print("no");
				break;
			}
		}
		if (m == 1)
		{
			System.out.printf("%d %d", s, l);
		}
		return 0;
	}

}

