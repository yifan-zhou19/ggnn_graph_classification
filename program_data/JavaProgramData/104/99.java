package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int chang = int array[100];
		int[] a = new int[100];
		int[] b = new int[100];
		int x;
		int y;
		int i;
		int j;
		int m;
		int n;
		int k = 0;
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
			if (x > 1)
			{
				a[i] = x / 2;
				x = x / 2;
			}
			else
			{
				break;
			}
		}
		for (j = 1;;j++)
		{
			if (y > 1)
			{
				b[j] = y / 2;
				y = y / 2;
			}
			else
			{
				break;
			}
		}
		m = chang(a);
		n = chang(b);
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (k != 0)
					{
						break;
					}
					if (a[i] == b[j])
					{
						k = b[j];
						break;
					}
				}
			}
		System.out.printf("%d",k);
	}
	public static int chang(int[] array)
	{
		int i;
		int k = 0;
		for (i = 0;;i++)
		{
			if ((array[i] != 0) && (array[i + 1] == 0))
			{
				k = i + 1;
				break;
			}
		}
		return (k);
	}
}

