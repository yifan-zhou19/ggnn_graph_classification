package <missing>;

public class GlobalMembers
{
	public static int a(int x,int y)
	{
		int[] a = new int[300];
		int i;
		int p;
		int b = 1;
		for (i = 0;i < x;i++)
		{
			a[i] = i + 1;
		}
		while (x > 1)
		{
		p = y % x;
		b = b - 1 + p;
		if (b == 0)
		{
			x = x - 1;
			b = b + 1;
		}
		else if (b <= x != 0 && b>0)
		{
			for (i = b - 1;i < x - 1;i++)
			{
				a[i] = a[i + 1];
			}
			x = x - 1;
		}
		else if (b > x)
		{
			b = b - x;
			for (i = b - 1;i < x - 1;i++)
			{
				a[i] = a[i + 1];
			}
			x = x - 1;
		}
		}
		return (a[0]);

	}
	public static void Main()
	{
		int a = new int(int x,int y);
		int[] n = new int[100];
		int[] m = new int[100];
		int[] c = new int[100];
		int k;
		for (k = 0;k < 100;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			if (n[k] == 0 && m[k] == 0)
			{
				break;
			}
		}
		for (k = 0;n[k] != 0;k++)
		{
			c[k] = a(n[k], m[k]);
		}
		for (k = 0;n[k] != 0;k++)
		{
			System.out.printf("%d\n",c[k]);
		}
	}






}

