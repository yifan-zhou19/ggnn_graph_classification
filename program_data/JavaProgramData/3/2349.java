package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int b;
		int c;
		int d;
		int[] a = new int[LEN];
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
			for (i = 0;i < n;i++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			}
		for (d = 0;d < n;d++)
		{
			b = k - a[d];
				for (i = 0;i < n;i++)
				{
					if ((b == a[i]) && (i != d))
					{
					c = 1;
					break;
					}
				}


		;
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		else if (c == 1)
		{
			System.out.print("yes");
		}
		return 0;
	}
}

