package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int h;
		int i;
		int o;
		int z;
		int m;
		int b;
		int l;
		int t;
		int f = 0;
		int u;
		int k = 0;
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		c = new Scanner(System.in).nextLine();
		for (h = 0;h < 500;h++)
		{
			a[h] = 0;
		}
		b = c.length();
		t = b - n;
		for (i = 0;i <= t;i++)
		{
			for (o = i;o <= t;o++)
			{
				for (u = 0;u <= n - 1;u++)
				{
					if (c.charAt(i + u) == c.charAt(o + u))
					{
						k += 1;
					}
				}
				if (k == n)
				{
					a[i] += 1;
				}
				k = 0;
			}
		}
		z = a[0];
		for (l = 1;l <= t;l++)
		{
			if (a[l] > z)
			{
				f = l;
				z = a[l];
			}
		}
		if (z == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d",z);
			for (m = 0;m <= t;m++)
			{
				if (a[m] == z)
				{
					System.out.printf("\n%c",c.charAt(m));
					for (u = 1;u <= n - 1;u++)
					{
						System.out.printf("%c",c.charAt(m + u));
					}
				}
			}
		}
		return 0;
	}
}

