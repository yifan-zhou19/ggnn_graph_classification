package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int b;
		int c = 0;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int p = 1;
		int m;
		int k;
		int l;
		int n;
		int s = 0;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		c = 0;
		p = 1;
		s = 0;
		if (m == 0 && n == 0)
		{
			break;
		}
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = i + 1;
		}
		for (i = n;i <= 299;i++)
		{
			a[i] = 0;
		}
		for (;;)
		{
			if ((p + m) % n == 1 || (p + m) % n == 0)
			{
				p = (p + m) % n + n - 1;
			}
			else
			{
				p = (p + m) % n - 1;
			}
			   if (p == 0)
			   {
				   break;
			   }
			for (j = p - 1;j <= n - 1;j++)
			{
				a[j] = a[j + 1];
			}
			n = n - 1;
		}
		System.out.printf("%d\n",a[0]);
		}
		return 0;
	}
}

