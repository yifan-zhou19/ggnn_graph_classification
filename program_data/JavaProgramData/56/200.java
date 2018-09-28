package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int i;
		int x;
		int y;
		for (i = 0;i <= 3;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i <= 3;i++)
		{


		x = a[i];

		if (x <= 9)
		{
			y = x;
		}
		else
		{
			y = 0;
			for (;x > 9;x /= 10)
			{
				y = (y + x - x / 10 * 10) * 10;
			}
				y = y + x;

		}
		System.out.printf("%d\n",y);
		}

		return 0;
	}
}

