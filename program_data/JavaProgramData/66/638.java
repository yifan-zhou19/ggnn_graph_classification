package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weekdays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		int y;
		int m;
		int d;
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		System.in.read();
		w = y % 7 + y / 4 - y / 100 + y / 400;
		for (i = 1;i < m;i++)
		{
			w += days[i];
		}
		w += d - 1;
			if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && (m <= 2))
			{
				w--;
			}
		System.out.printf("%s.\n",weekdays[w % 7]);
		System.in.read();
		return 0;
	}

}

