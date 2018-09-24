package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int b = 0;
		int c = 0;
		int d = 1;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[b] = Integer.parseInt(tempVar);
		}
		while (a[b] != -1)
		{
			while (a[b] != 0)
			{
				b++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[b] = Integer.parseInt(tempVar2);
				}
			}
			while (c <= b)
			{
				while (d < b)
				{
					if (a[c] == (a[d] * 2))
					{
						e = e+1;
					}
					d = d + 1;
				}
				c = c + 1;
				d = 0;
			}
			System.out.printf("%d\n",e);
			b = 0;
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				a[b] = Integer.parseInt(tempVar3);
			}
			e = 0;
			c = 0;
		}
		return 0;
	}
}

