package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int k;
		int l;
		int x;
		int y;
		int flag = 0;

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
		for (i = 1;x != 1;i++)
		{
			if (x % 2 == 0)
			{
				a[i] = x / 2;
				x = a[i];
			}
			else
			{
				a[i] = (x - 1) / 2;
				x = a[i];
			}
		}
		for (j = 1;y != 1;j++)
		{
			if (y % 2 == 0)
			{
				b[j] = y / 2;
				y = b[j];
			}
			else
			{
				b[j] = (y - 1) / 2;
				y = b[j];
			}
		}
		for (l = 0;l <= i;l++)
		{
			for (k = 0;k <= j;k++)
			{
				if (b[k] == a[l])
				{
					System.out.printf("%d",a[l]);
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
				break;
			}
		}
	}
}

