package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		l = 0;
		for (i = 1;l == 0;i++)
		{
			m = i * n + k;
			h = 0;
			for (j = 2;j <= n != 0 && h == 0;j++)
			{
				if (m % (n - 1) == 0)
				{
					m = m / (n - 1) * n + k;
				}
				else
				{
					h = 1;
					break;
				}
			}
			if (h != 0)
			{
				h = h;
			}

						 else

						 {
				System.out.printf("%d\n",m);
				l = 1;
				break;
						 }
		}
	}
}

