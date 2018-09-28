package <missing>;

public class GlobalMembers
{
	public static int cont(int s)
	{
		int i;
		int j;
		j = 1;
		for (i = 0;i <= 10;i++)
		{
			s = s / 10;
			if (s == 0)
			{
				break;
			}
			else
			{
				j++;
			}
		}
		return (j);
	}
	public static int su(int p)
	{
		int i;
		int t;
		int m;
		int w;
		w = p,t = 0;
		for (i = 1;i <= w;i++)
		{
		   m = p % i;
		   if (m == 0)
		   {
			   t++;
		   }
		}
		if (t > 2)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int dao(int m,int n)
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int k;
		int l;
		int t;
		int s;

	a[0] = m;
	t = 0;
	for (i = 1;i < n;i++)
	{
	a[i] = a[i - 1] / 10;
	}
	a[n] = 0;
	for (i = n;i > 0;i--)
	{
	b[i] = a[i - 1] - a[i] * 10;
	}

	for (s = 1;s <= n;s++)
	{
		for (j = n - s;j > 0;j--)
		{
			b[s] = b[s] * 10;
		}
	}
	for (i = 1;i <= n;i++)
	{
	t = t + b[i];
	}
	return (t);
	}


	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int f;
		int o;
		int s;
		int t;
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
		k = 0;
		o = 0;
		for (i = m;i <= n;i++)
		{
			f = cont(i);
		t = dao(i, f);
	s = su(i);
		if (t == i && s == 0)
		{
			a[o] = i;
			o++;
		}
		}
		o--;
		if (o + 1 == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < o;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[i]);
		}
	}




}

