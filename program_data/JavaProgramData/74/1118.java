package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int p;
		int q;
		int r;
		int s;
		int t;
		int h;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		h = 0;
		for (s = m;s <= n;s++)
		{
			p = 0;
			q = s;
			while (q != 0)
			{
				p = p * 10 + q % 10;
				q = q / 10;
			}
			if (p != s)
			{
				t = 0;
				continue;
			}
			else
			{
				t = 1;
			}
			for (j = 2;j < s;j++)
			{
				if (s % j == 0)
				{
					r = 0;
					break;
				}
				r = 1;
			}
			if (r == 0)
			{
				continue;
			}
			if (r == 1 && t == 1)
			{
				h = 1 + h;
			}
			else
			{
				h = h;
			}
			System.out.printf("%d",s);
			break;
		}
		for (k = s + 1;k <= n;k++)
		{
			p = 0;
			q = k;
			while (q != 0)
			{
				p = p * 10 + q % 10;
				q = q / 10;
			}
			if (p != k)
			{
				t = 0;
				continue;
			}
			else
			{
				t = 1;
			}
			for (j = 2;j < k;j++)
			{
				if (k % j == 0)
				{
					r = 0;
					break;
				}
				r = 1;
			}
			if (r == 0)
			{
				continue;
			}
			if (r == 1 && t == 1)
			{
				h = 1 + h;
			}
			System.out.printf(",%d",k);
		}
		if (h == 0)
		{
			System.out.print("no");
		}

	}


}

