package <missing>;

public class GlobalMembers
{
	public static int re(tangible.RefObject<Integer> a)
	{
		int i;
		int h;
		int g;
		int f = 1;
		int n = 0;
		if (a.argValue < 0)
		{
			f = -1;
			a.argValue *= -1;
		}
		else if (a.argValue == 0)
		{
			return 0;
		}
		for (h = 1; a.argValue+0.1 > Math.pow(10,h);h++)
		{
			;
		}
		g = h;
		for (i = 0;i < h;i++)
		{
			if (g == 1)
			{
				n += a.argValue;
			}
			else
			{
				n += (a.argValue % 10) * Math.pow(10,--g);
			}
			a.argValue = (a.argValue - a.argValue % 10) / 10;
		}
		return (f * n);
	}
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",re(a + i));
		}
	}

}

