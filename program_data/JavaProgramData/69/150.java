package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String f = new String(new char[251]);
		int[] c = new int[252];
		int[] d = new int[251];
		int[] e = new int[252];
		int s;
		int j;
		int i;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		x = a.length();
		y = b.length();
		e[0] = 0;
		if (x < y)
		{
			f = a;
			a = b;
			b = f;
					  s = x;
			x = y;
			y = s;
		}
		for (i = 0;i < y;i++)
		{
			d[i] = b.charAt(i) - 48;
		}
		for (j = 0;j < x;j++)
		{
			c[j] = a.charAt(j) - 48;
		}
		for (i = 0;i < y;i++)
		{
			e[x - i] = c[x - i - 1] + d[y - i - 1];
		}
		for (i = y;i < x;i++)
		{
			e[x - i] = c[x - i - 1];
		}
		for (j = x;j > 0;j--)
		{
			if (e[j] > 9)
			{
				e[j] = e[j] - 10;
				e[j - 1] = e[j - 1] + 1;
			}
		}
		if (x > 1)
		{
		for (j = 0;j < x + 1;j++)
		{
			if (e[j] != 0)
			{
				for (i = j;i < x + 1;i++)
				{
					System.out.printf("%d",e[i]);
				}
					break;
			}
		}
		}
		else
		{
			System.out.printf("%d",c[0]);
		}
		return 0;
	}

}

