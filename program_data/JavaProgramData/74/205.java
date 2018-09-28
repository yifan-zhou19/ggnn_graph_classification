package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int t = 0;
		int p = 0;
		int q;
		int a;
		int b;
		int c = 0;
		int d = 0;
		int[] x = new int[100];
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
			for (j = 1;j <= i;j++)
			{
				if (i % j == 0)
				{
					t++;
				}
			}
		if (t == 2)
		{
			b = i;
		for (a = Math.log10(b);a >= 0;a--)
		{
			x[k] = b / (Math.pow(10,a));
			b = b - x[k] * Math.pow(10,a);
			k++;
		}
		q = Math.log10(i);
		for (j = 0;j <= q;j++)
		{
			if (x[j] != x[q - j])
			{
				p = 1;
			}
		}
		if (p == 0 && d == 1)
		{
			System.out.printf(",%d",i);
		}
		if (p == 0 && d == 0)
		{
			System.out.printf("%d",i);
			c = 1;
			d = 1;
		}
		}
		t = 0;
		p = 0;
		k = 0;
		}
		if (c == 0)
		{
			System.out.print("no");
		}
	}
}

