package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = new int[100000];
		 int[] b = new int[100000];
		 int[] c = new int[100000];
		 int d;
		 int e;
		 int i;
		 int m;
		 int n;
		 int p;
		 int q;
		 int[] f = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100000;i++)
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
		if (a[i] == 0 && b[i] == 0)
		{
		break;
		}
	d = i;
		}
		for (m = 0;m <= n - 1;m++)
		{
			c[m] = 0;
		}
		for (m = 0;m <= n - 1;m++)
		{
			for (i = 0;i <= d;i++)
			{
			if (b[i] == m)
			{
				c[m]++;
			}
			}
		}
		for (m = 0;m <= n - 1;m++)
		{
			f[m] = c[m];
		}
		for (m = 0;m <= n - 2;m++)
		{
			if (f[m] >= f[m + 1])
			{
				f[m + 1] = f[m];
			}
		}

		for (m = 0;m <= n - 1;m++)
		{
			if (c[m] == f[n - 1])
			{
			 if (c[m] >= n - 1)
			 {
		System.out.printf("%d",m);
			 }
		else
		{
			System.out.print("NOT FOUND");
		}
			}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}


}

