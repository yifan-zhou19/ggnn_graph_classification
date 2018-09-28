package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int[] c = new int[10000];
		int i;
		int j;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10000;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 10000;j++)
			{
				if ((j >= a[i]) && (j < b[i]))
				{
					c[j] = 1;
				}
			}
		}
		x = a[0];
		y = b[0];
		for (i = 0;i < n;i++)
		{
			if (x >= a[i])
			{
				x = a[i];
			}
			if (y <= b[i])
			{
				y = b[i];
			}
		}
		j = 0;
		for (i = x;i < y;i++)
		{
			if (c[i] != 1)
			{
			   System.out.print("no");
			   j++;
			   break;
			}

		}
		if (j == 0)
		{
			System.out.printf("%d %d",x,y);
		}



		return 0;

	}

}

