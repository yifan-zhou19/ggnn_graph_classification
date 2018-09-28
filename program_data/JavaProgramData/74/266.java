package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] t = new int[10000];
		int k = 0;
		int l = 1;
		int u;
		int v;
		int h;
		int b;
		int c;
		int d;
		int e;
		int[] a = new int[10000];
		int x;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			q = 0;
			u = 0;
			h = Math.log10(i);
			for (j = h;j >= 0;j--)
			{

				b = Math.pow(10,j + 1);
				c = Math.pow(10,j);
				d = i % b - i % c;
				e = d / c;
				a[h - j] = e;
			}
			for (j = 0;j <= h;j++)
			{
				if (a[j] == a[h - j])
				{
				  q++;
				}
				else if (a[j] != a[h - j])
				{
				  break;
				}
			}
			if (q == h + 1)
			{
				u = 1;
			}
			q = 0;
			v = 0;
			j = 2;
			while (j <= Math.sqrt(i))
			{
				if (i % j == 0)
				{
					q = 1;
					break;
				}
				else
				{
					j++;
				}
			}
			if (i == 1)
			{
				q = 1;
			}
			if (q == 0)
			{
				v = 1;
			}
			if (u == 1 && v == 1)
			{
				t[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",t[i]);
			}
			System.out.printf("%d\n",t[k - 1]);
		}
	}

}

