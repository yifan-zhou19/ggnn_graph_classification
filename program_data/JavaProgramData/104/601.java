package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int c = 0;
		int m;
		int n;
		int[] a = new int[50];
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		for (i = 1;i < 50;i++)
		{
			if (x == 1)
			{
				m = i;
				break;
			}
			else
			{
				a[i] = x / 2;
				x = x / 2;
			}
		}
		for (i = 1;i < 50;i++)
		{
			if (y == 1)
			{
				n = i;
				break;
			}
			else
			{
				b[i] = y / 2;
				y = y / 2;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					c = 1;
					break;
				}
			}
			if (c == 1)
			{
				break;
			}
		}
	}
}

