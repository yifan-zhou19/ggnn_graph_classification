package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int i;
		int k;
		int[] p = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		i = 0;
		do
		{
			p[i] = y % 10;
			i++;
			y = y / 10;
		} while (y / 10 < 10 && y / 10 >= 1);
		p[i] = y;
		for (k = 0;k <= i;k++)
		{
			System.out.printf("%d",p[k]);
		}

		return 0;
	}
}

