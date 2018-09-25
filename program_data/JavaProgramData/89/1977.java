package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[10000];
		int[] n = new int[10000];
		int x;
		int y;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (;;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x == 0 && y == 0)
			{
			break;
			}
			m[x]++;
			n[y]++;
		}
		for (x = 0;x < s;x++)
		{
		y = 0;
		}
		for (x = 0;x < s;x++)
		{
			if (m[x] == 0 && n[x] == s - 1)
			{
				y++;
				System.out.printf("%d",x);
			}
		}
		if (y == 0)
		{
		System.out.print("NOT FOUND");
		}
	}
}

