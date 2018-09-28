package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = new int(int a[],int n);
		int min = new int(int a[],int n);
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 1;
		int j;
		int[] c = new int[1000];
		int count = 0;
		int n;
		int maxa;
		int maxb;
		int mina;
		int minb;
		int max_;
		int min_;
		int max0;
		int maxman;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (System.in.read() == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		n = i;
		i = 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		while (System.in.read() == ',')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			i++;
		}
		maxa = max(a, n);
		maxb = max(b, n);
		mina = min(a, n);
		minb = min(b, n);
		if (maxa >= maxb)
		{
			max_ = maxa;
		}
		else
		{
			max_ = maxb;
		}
		if (mina <= minb)
		{
			min_ = mina;
		}
		else
		{
			min_ = minb;
		}
		for (max0 = min_;max0 <= max_;max0++)
		{
			for (i = 0;i < n;i++)
			{
				if (max0 >= a[i] != 0 && max0 < b[i])
				{
					c[count]++;
				}
			}
			count++;
		}
		count--;
		maxman = c[0];
		for (i = 1;i <= count;i++)
		{
			if (c[i] >= maxman)
			{
				maxman = c[i];
			}
		}
		System.out.printf("%d %d\n",n,maxman);
	}

	public static int max(int[] a, int n)
	{
		int b;
		int i;
		b = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] >= b)
			{
				b = a[i];
			}
		}
		return b;
	}

	public static int min(int[] a, int n)
	{
		int b;
		int i;
		b = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] <= b)
			{
				b = a[i];
			}
		}
		return b;
	}






















}

