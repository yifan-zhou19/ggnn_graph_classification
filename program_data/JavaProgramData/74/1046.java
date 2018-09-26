package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int F = int i;
		int G = int i;
		int m;
		int n;
		int i;
		int[] a = new int[400];
		int b = 0;
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
			if ((F(i) == 1) && (G(i) == 1))
			{
				a[b] = i;
				b++;
			}
		}
		if (b != 0)
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < b;i++)
			{
			System.out.printf(",%d",a[i]);
			}
		}
		else
		{
			System.out.print("no");
		}
	}

	public static int F(int i)
	{
		int e;
		int k;
		k = Math.sqrt(i);
		for (e = 2;e <= k;e++)
		{
		if (i % e == 0)
		{
			break;
		}
		}
		if (e > k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int G(int i)
	{
		int f;
		int g = 0;
		f = i;
		while (g < f)
		{
			g = g * 10 + i % 10;
			i = i / 10;
		}
		if (g == f)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

