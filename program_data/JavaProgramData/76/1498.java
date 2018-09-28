package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		double k = 0.0;
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
		int amin = a[0];
		int bmax = b[0];
		int f = 1;
		int g = 0;
		for (i = 1;i < n;i++)
		{
			if (amin > a[i])
			{
				amin = a[i];
			}
			if (bmax < b[i])
			{
				bmax = b[i];
			}
		}
		for (k = amin + 0.5;k < bmax;k++)
		{
			for (i = 0;i < n && f == 1;i++)
			{
				if (k >= a[i] != 0 && k <= b[i])
				{
					f = 0;
					g++;
				}
			}
			f = 1;
		}
		if (g >= bmax - amin)
		{
			System.out.printf("%d %d",amin,bmax);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}



}

