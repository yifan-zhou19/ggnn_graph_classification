package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[20];
		int[] b = new int[20];
		int i = 0;
		int j = 0;
		int k;
		int m;
		int flag = 0;
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
		while (x != 0)
		{
			a[i] = x;
			i++;
			x = x / 2;
		}
		while (y != 0)
		{
			b[j] = y;
			j++;
			y = y / 2;
		}
		for (k = 0;k < i;k++)
		{
			for (m = 0;m < j;m++)
			{
				if (a[k] == b[m])
				{
					System.out.printf("%d",a[k]);
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

