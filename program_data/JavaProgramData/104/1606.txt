package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int l;
		int[] a = new int[13];
		int[] b = new int[13];
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
		for (i = 0;x > 0;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		l = i;
		for (;y > 0;y = y / 2)
		{
			for (j = 0;j < l;j++)
			{
				if (a[j] == y)
				{
					System.out.printf("%d",a[j]);
					return 0;
				}
			}
		}
	}

}

