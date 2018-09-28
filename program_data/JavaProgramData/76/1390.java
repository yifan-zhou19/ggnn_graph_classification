package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int x;
		int d;
		int m;
		int y = 0;
		int s = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
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
		t = a[0];
		for (i = 0;i < n;i++)
		{
			if (t > a[i])
			{
				t = a[i];
			}
		}
		x = t;
		t = b[0];
		for (i = 0;i < n;i++)
		{
			if (t < b[i])
			{
				t = b[i];
			}
		}
		d = t;
		t = d - x;
		double[] e = new double[t];
		for (m = 0;m < t;m++)
		{
			for (i = 0;i < n;i++)
			{
				e[m] = m + x + 0.5;
				if (e[m] > a[i] && e[m] < b[i])
				{
					y = 1;
					break;
				}
			}
			s *= y;
			y = 0;
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",x,d);
		}
	}


}

