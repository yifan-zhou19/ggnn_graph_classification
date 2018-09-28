package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int h = 0;
		int k = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		h = x + 1;
		int[] strm = new int[h];
		int[] strn = new int[h];
		for (d = 0;d <= x;d++)
		{
			strm[d] = 0;
			strn[d] = 0;
		}
		for (;;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			else
			{
				strm[m] = strm[m] + 1;
				strn[n] = strn[n] + 1;
			}
		}
		for (j = 0;j <= x - 1;j++)
		{
			if (strm[j] == 0 && strn[j] == x - 1)
			{
				System.out.printf("%d",j);
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
	}
}

