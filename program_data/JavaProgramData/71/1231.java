package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int y;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}

			if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
			{
				m[1] = 29;
			}
			else
			{
				m[1] = 28;
			}

			if (a > b)
			{
				c = a - b;
				a = b;
			}
			else
			{
				c = b - a;
			}

			b = 0;
			for (;c > 0;c--)
			{
				b += m[a - 1];
				a++;
			}
			if (b % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

