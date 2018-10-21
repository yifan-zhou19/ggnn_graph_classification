package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static int n = 1;
	public static int m = 1;
	public static int[] k = new int[1001];
	public static char c;
	public static void scan()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == ',')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[n] = Integer.parseInt(tempVar3);
				}
				n++;
			}
			else
			{
				break;
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[0] = Integer.parseInt(tempVar4);
		}
		while (true)
		{
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				c = tempVar5.charAt(0);
			}
			if (c == ',')
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[m] = Integer.parseInt(tempVar6);
				}
				m++;
			}
			else
			{
				break;
			}
		}
	}
	public static void Main()
	{
		int i;
		int l;
		scan();
		for (i = 0;i <= 1000;i++)
		{
			for (l = 0;l < n;l++)
			{
				if ((i >= a[l]) && i < b[l])
				{
					k[i]++;
				}
			}
		}
		l = k[0];
		for (i = 0;i <= 1000;i++)
		{
			l = l > k[i] != 0?l:k[i];
		}
		System.out.printf("%d %d",n,l);
	}

}

