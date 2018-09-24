package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] book = new int[1020];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		char c;
		int[] a = new int[27];
		int[][] b = new int[27][1000];
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i] = Integer.parseInt(tempVar2);
			}
			System.in.read();
			for (;;)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					c = tempVar3.charAt(0);
				}
				if (c == '\n')
				{
					break;
				}
				a[c - 64] += 1;
				b[c - 64][i] = 1;
			}
		}
		int max = 0;
		int p;
		for (i = 1;i < 27;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				p = i;
			}
		}
		System.out.printf("%c\n%d\n",p + 64,max);
		for (i = 0;i < 1000;i++)
		{
			if (b[p][i] == 1)
			{
				System.out.printf("%d\n",book[i]);
			}
		}
		return 0;
	}
}

