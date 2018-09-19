package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int n;
		int m;
		int[] rx = new int[1000];
		int[] ry = new int[1000];

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

		rx[0] = x;
		ry[0] = y;
		for (i = 1;x != 0;i++)
		{
			x = x / 2;
			rx[i] = x;
		}
		m = i - 1;
		for (j = 1;y != 0;j++)
		{
			y = y / 2;
			ry[j] = y;
		}
		n = j - 1;
		for (i = m - 1, j = n - 1;i >= 0 && j >= 0;i--, j--)
		{
			if (rx[i] != ry[j])
			{
				break;
			}
		}

		System.out.printf("%d",rx[i + 1]);
	}
}

