package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int m;
		int n;
		int i;
		int j;
		int flag = 0;
		double t;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		for (i = 1;;i++)
		{
			t = Math.pow(2,i);
			if (x / t < 1)
			{
				m = (int)i;
				break;
			}
		}
		for (i = 1;;i++)
		{
			t = Math.pow(2,i);
			if (y / t < 1)
			{
				n = (int)i;
				break;
			}
		}

		for (i = 1;i < m;i++)
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (b[i - 1] % 2 == 0)
			{
				b[i] = b[i - 1] / 2;
			}
			else
			{
				b[i] = (b[i - 1] - 1) / 2;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
	}
}

