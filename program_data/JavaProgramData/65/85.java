package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int[] b = new int[N];
		int n;
		int i;
		int p;
		int q;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		p = 0;
		q = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] - b[i] == 1 || a[i] - b[i] == -2)
			{
				q++;
			}
			else if (a[i] - b[i] != 0)
			{
					p++;
			}
		}
		if (p > q)
		{
			System.out.print("A");
		}
		else if (q > p)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
			return 0;
	}


}

