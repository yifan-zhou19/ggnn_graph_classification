package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
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
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 1;
		int j = 1;
		a[1] = x;
		b[1] = y;
		if (x == y)
		{
			System.out.printf("%d",x);
		}
		else
		{
		while (a[i] != 1)
		{
			i++;
			if (x % 2 == 0)
			{
				a[i] = x / 2;
				x = x / 2;
			}
			else
			{
				a[i] = (x - 1) / 2;
				x = (x - 1) / 2;
			}
		}
		while (b[j] != 1)
		{
			j++;
			if (y % 2 == 0)
			{
				b[j] = y / 2;
				y = y / 2;
			}
			else
			{
				b[j] = (y - 1) / 2;
				y = (y - 1) / 2;
			}
		}
		while (a[i] == b[j])
		{
			i--;
			j--;
		}
		System.out.printf("%d",a[i + 1]);
		}
	}

}

