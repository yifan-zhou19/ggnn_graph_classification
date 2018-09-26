package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int n;
		int k;
		int l;
		int[] a = new int[10000];
		int[] b = new int[10000];
		h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (c = 1;c < n;c++)
		{
			for (d = 0;d < n - c;d++)
			{
				if (a[d] > a[d + 1])
				{
					e = a[d + 1];
					a[d + 1] = a[d];
					a[d] = e;
					l = b[d + 1];
					b[d + 1] = b[d];
					b[d] = l;
				}
			}
		}
		for (c = 0;c < n - 1;c++)
		{
			f = 0;
			for (g = 0;g < c + 1;g++)
			{
			if (a[c + 1] > b[g])
			{
				f++;
			}
			}
			if (f == c + 1)
			{
				h++;
			}
		}
		for (c = 1;c < n;c++)
		{
			for (d = 0;d < n - c;d++)
			{
				if (b[d] > b[d + 1])
				{
					e = b[d + 1];
					b[d + 1] = b[d];
					b[d] = e;
				}
			}
		}
		if (h == 0)
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
			return 0;
	}



}

