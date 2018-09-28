package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		int p = 0;
		int q = 0;
		int[] a = new int[200];
		int[] b = new int[200];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				if (b[i] == 1)
				{
				p++;
				}
				if (b[i] == 2)
				{
				q++;
				}
			}
			if (a[i] == 1)
			{
				if (b[i] == 0)
				{
				q++;
				}
				if (b[i] == 2)
				{
					p++;
				}
			}
			if (a[i] == 2)
			{
				if (b[i] == 0)
				{
					p++;
				}
				if (b[i] == 1)
				{
					q++;
				}
			}
			if (a[i] == b[i])
			{
				c++;
			}
		}
		if (c == n || p == q)
		{
			System.out.print("Tie");
		}
		if (p > q)
		{
			System.out.print("A");
		}
		if (p < q)
		{
			System.out.print("B");
		}
		return 0;
	}
}

