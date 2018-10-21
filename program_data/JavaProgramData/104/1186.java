package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] an = new int[15];
		int[] bn = new int[15];
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
		int i = 0;
		int j = 0;
		int t = 1;
		while (x != 0)
		{
			an[i] = x;
			x = x / 2;
			i++;
		}
		while (y != 0)
		{
			bn[j] = y;
			y = y / 2;
			j++;
		}
		while (true)
		{
			if (an[i - t] != bn[j - t] || i - t < 0 || j - t < 0)
			{
				break;
			}
			t++;
		}
		System.out.printf("%d",an[i - t + 1]);
		return 0;
	}

}

