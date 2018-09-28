package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1];
		int[] b = new int[1];
		int m;
		int k;
		int c;
		int d;
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			if (m == 0 && k == 1)
			{
				a[0]++;
			}
			if (m == 1 && k == 0)
			{
				b[0]++;
			}
			if (m == 1 && k == 2)
			{
				a[0]++;
			}
			if (m == 2 && k == 1)
			{
				b[0]++;
			}
			if (m == 0 && k == 2)
			{
				b[0]++;
			}
			if (m == 2 && k == 0)
			{
				a[0]++;
			}
			if (m == k)
			{
				a[0]++;
				b[0]++;
			}
		}
		c = a[0];
		d = b[0];
		if (c > d)
		{
			System.out.print("A");
		}
		if (c < d)
		{
			System.out.print("B");
		}
		if (c == d)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

