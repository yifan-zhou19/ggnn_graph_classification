package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int k;
		int h;
		int sh;
		int ch;
		int l;
		int o;
		int x = 0;
		int[] a = new int[10000];
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
		for (i = m;i <= n;i++)
		{
			j = 0;
			l = i;
			p = Math.log10(i);
			for (k = p;k >= 1;k--)
			{
				sh = 1;
				ch = 1;
				for (h = 1;h < p - k + 1;h++)
				{
					ch = ch * 10;
				}
				for (h = 0;h < k;h++)
				{
				   sh = sh * 10;
				}
				j = l / sh * ch + j;
				l = l - sh * (l / sh);
			}
			ch = ch * 10;
			j = l * ch + j;
			j = j + 1 - 1;
			if (i == j)
			{
				for (o = 2;o <= Math.sqrt(j);o++)
				{
					if (j % o == 0)
					{
						break;
					}
				}
				if (o == (int)Math.sqrt(j) + 1)
				{
				a[x] = j;
				x = x + 1;
				}
			}
		}


		if (x == 0)
		{
			System.out.print("no");
		}
		else
		{

			for (i = 0;i < x;i++)
			{
				if (i != x - 1)
				{
			System.out.printf("%d,",a[i]);
				}
			else
			{
				System.out.printf("%d",a[i]);
			}
			}
		}








		return 0;
	}
}

