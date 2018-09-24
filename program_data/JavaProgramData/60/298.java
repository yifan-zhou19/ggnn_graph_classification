package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int d;
		int m;
		int n;
		int i;
		int j;
		int s;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1 || n == 2 || n == 3 || n == 4)
		{
		System.out.print("empty\n");
		}
		else
		{
		for (i = 2,m = 0;i <= n;i++)
		{
		for (j = 2,s = 0;j <= i;j++)
		{
		if (i % j == 0)
		{
		s = s + 1;
		}
		}
		if (s == 1)
		{
		a[m] = i;
		m = m + 1;
		}
		}
		for (d = 0,b = 0;d < m;d++)
		{
		if (a[d + 1] == a[d] + 2)
		{
		System.out.printf("%d %d\n",a[d],a[d + 1]);
		}
		b = b + 1;
		}
		if (b == 0)
		{
		System.out.print("empty\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		}
		System.in.read();
		System.in.read();
	}
}

