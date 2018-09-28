package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		return (x > y)?x:y;
	}
	public static int min(int x,int y)
	{
		return (x < y)?x:y;
	}
	public static void Main()
	{
		int[] a = new int[251];
		int[] b = new int[251];
		int[] c = new int[250];
		int i;
		int j;
		int k = 0;
		int x;
		int y;
		String m = new String(new char[250]);
		String n = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		x = m.length();
		y = n.length();
		for (i = 0;i < x;i++)
		{
			a[i + 1] = m.charAt(i) - 48;
		}
		for (i = 0;i < y;i++)
		{
			b[i + 1] = n.charAt(i) - 48;
		}
		if (x > y)
		{
			for (i = 1;i <= x;i++)
			{
				c[i] = a[i];
			}
		}
		else
		{
			for (i = 1;i <= y;i++)
			{
				c[i] = b[i];
			}
		}
		c[0] = 0;
		for (i = 0;i < min(x, y);i++)
		{
			if (a[x - i] + b[y - i] + k < 10)
			{
				c[max(x, y) - i] = a[x - i] + b[y - i] + k;
				k = 0;
			}
			else
			{
				c[max(x, y) - i] = (a[x - i] + b[y - i] + k) % 10;
				k = 1;
			}
		}
		c[max(x, y) - i] += k;
		for (i = max(x, y);i > 0;i--)
		{
			if (c[i] >= 10)
			{
				c[i] = (c[i] % 10);
				c[i - 1] += 1;
			}
		}
		for (i = 0;;i++)
		{
			if (c[i] != 0)
			{
				break;
			}
		}
		for (j = i;j <= max(x, y);j++)
		{
			System.out.printf("%d",c[j]);
		}
		if (i > max(x, y))
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}

}

