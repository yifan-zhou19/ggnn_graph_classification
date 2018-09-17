package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int found = new int(int x,int y);

		int x;
		int y;
		int z;

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

		z = found(x, y);

		System.out.printf("%d\n",z);
	}

	public static int found(int x,int y)
	{
		int i;
		int j;
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 0;i < 10;i++)
		{
			a[i] = x;
			x = x / 2;
		}

		for (i = 0;i < 10;i++)
		{
			b[i] = y;
			y = y / 2;
		}

		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
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

