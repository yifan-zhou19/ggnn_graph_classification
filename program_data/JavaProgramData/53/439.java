package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int x = 0;
		int y;
		int z = 0;
		int p;
		int enter;
		int count;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}

		while (z <= i - 1)
		{
			z++;
			count = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				enter = Integer.parseInt(tempVar2);
			}

			for (y = 0;y < x;y++)
			{
				if (enter == a[y])
				{
				count++;
				}
			}
			if (count != 0)
			{
				continue;
			}
			a[x] = enter;
			x++;

		}



		for (p = 0;p < x - 1;p++)
		{
			System.out.printf("%d,",a[p]);
		}
		System.out.printf("%d",a[x - 1]);





	}
}

