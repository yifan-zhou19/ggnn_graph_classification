package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int x;
		int[] b = new int[300];
		int y = 0;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			c = 0;
			if (i == 0)
			{
			  b[y] = a[i];
			  y++;
			}
			else
			{
				for (x = 0;x < i;x++)
				{
					if (a[i] != a[x])
					{
						c++;
					}
				}
				if (c == i)
				{
					b[y] = a[i];
					y++;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < y;i++)
		{
			System.out.printf(",%d",b[i]);
		}


		return 0;
	}

}

