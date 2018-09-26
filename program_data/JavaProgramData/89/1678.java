package <missing>;

public class GlobalMembers
{
	public static int[] data = new int[100000];
	public static int Main()
	{
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x + y == 0)
			{
				break;
			}
			data[x] = -1;
			if (data[y] >= 0)
			{
				data[y]++;
			}
		}
		int i = n;
		while (n - .=0)
		{
			if (data[n] == i - 1)
			{
			System.out.printf("%d\n",n);
			break;
			}
		}
		if (n < 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

