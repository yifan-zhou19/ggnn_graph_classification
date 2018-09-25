package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int geshu(int a,int x)
	{
		int y;
		int z;
		z = a;
		y = (int)Math.sqrt(a);
		while (x <= y)
		{
			if (a % x == 0)
			{
				a = a / x;
				geshu(a, x);
			}
			if (a == z / x)
			{
				a = z;
			}
			x++;
		}
		sum++;
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int x;
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
			if (a[i] == 2 || a[i] == 3)
			{
				b[i] = 1;
			}
			else
			{
				sum = 0;
				x = 2;
				b[i] = geshu(a[i], x);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}
}

