package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i = 0;
		int j = 0;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
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
		while (a[i] != 1)
		{
			i = i + 1;
			a[i] = a[i - 1] / 2;
		}
		while (b[j] != 1)
		{
			j = j + 1;
			b[j] = b[j - 1] / 2;
		}

		if (i <= j)
		{
			for (k = 0;k < i + 1;k++)
			{
				if (a[k] == b[j - i + k])
				{
					System.out.printf("%d",a[k]);
				break;
				}

			}
		}
		else
		{
			for (k = 0;k < j + 1;k++)
			{
				if (a[i - j + k] == b[k])
				{
					System.out.printf("%d",b[k]);
				break;
				}
			}
		}
	}


}

