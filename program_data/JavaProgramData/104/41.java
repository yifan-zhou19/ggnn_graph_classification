package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[] a = new int[20];
		int[] b = new int[20];
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
		{
			a[0] = x;
			b[0] = y;
		 for (i = 1;i <= 10;i++)
		 {
			 if (x % 2 != 0)
			 {
				 x = (x - 1) / 2;
				 a[i] = x;
				 continue;
			 }
		 if (x % 2 == 0)
		 {
			 x = x / 2;
			 a[i] = x;
		 }
		 }
		for (j = 1;j <= 10;j++)
		{
			if (y % 2 != 0)
			{
				y = (y - 1) / 2;
				b[j] = y;
				continue;
			}
		if (y % 2 == 0)
		{
			y = y / 2;
			b[j] = y;
		}
		}
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
		if (a[i] == b[j])
		{
		System.out.printf("%d\n",a[i]);
		i = 11;
		j = 11;
		}
			}
		}
	}
		return 0;
	}
}

