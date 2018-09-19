package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int back = new int(int x,int y);
		int x;
		int y;
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
		System.out.printf("%d\n",back(x, y));

		return 0;
	}

	public static int back(int x,int y)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i = 0;
		int j;
		int n1;
		int n2;
		while (x > 0)
		{
			a[i] = x;
			x = x / 2;
			i++;
		}
		n1 = i;
		i = 0;
		while (y > 0)
		{
			b[i] = y;
			y = y / 2;
			i++;
		}
		n2 = i;
		for (i = 0;i < n1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				if (a[i] == b[j])
				{
					return a[i];
					break;
				}
			}
		}
	}
}

