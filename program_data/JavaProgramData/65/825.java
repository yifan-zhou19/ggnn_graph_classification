package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		p = 0;
		q = 0;
		int[] a = new int[200];
		int[] b = new int[200];
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
				a[i - 1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i - 1] = Integer.parseInt(tempVar3);
			}
			if (a[i - 1] == 0 && b[i - 1] == 1)
			{
					p++;
			}
			if (a[i - 1] == 1 && b[i - 1] == 2)
			{
					p++;
			}
			if (a[i - 1] == 2 && b[i - 1] == 0)
			{
					p++;
			}
			if (a[i - 1] == 1 && b[i - 1] == 0)
			{
					q++;
			}
			if (a[i - 1] == 2 && b[i - 1] == 1)
			{
					q++;
			}
			if (a[i - 1] == 0 && b[i - 1] == 2)
			{
					q++;
			}
		}
		if (p > q)
		{
			System.out.print("A");
		}
		if (p < q)
		{
			System.out.print("B");
		}
		if (p == q)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

