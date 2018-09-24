package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[501]);
		int[] y = new int[501];
		int i;
		int j;
		int k;
		int l;
		int h;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		m = x.length();
		m = m - n;
		for (i = 0;i <= m;i++)
		{
			l = 0; //zongshu
			for (k = i;k <= m;k++)
			{
				h = 0; //panding
				for (j = 0;j < n;j++)
				{
					if (x.charAt(i + j) != x.charAt(k + j))
					{
						h++;
					}
				}
				if (h == 0)
				{
					l++;
				}
			}
			y[i] = l;
		}
		k = y[0];
		for (i = 1;i <= m;i++)
		{
			if (y[i] > k)
			{
				k = y[i];
			}
		}
	if (k == 1)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",k);
		for (i = 0;i <= m;i++)
		{
			if (k == y[i])
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",x.charAt(i + j));
				}
				System.out.print("\n");
			}
		}
	}
	}

}

