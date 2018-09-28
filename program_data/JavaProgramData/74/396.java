package <missing>;

public class GlobalMembers
{
	public static int pdhw(int i)
	{
		int d = 1;
		int f = 0;
		int j = 0;
		int k;
		int w;
		int v = 0;
		int[] b = new int[100];
		do
		{
			d = d * 10;
			f = i / d;
			j++;
		} while (f != 0);
		w = i;
		for (k = 0;k < j;k++)
		{
			b[k] = w % 10;
			w = w / 10;
		}
		for (k = 0;k < j;k++)
		{
			v = v * 10 + b[k];
		}
		if (v == i)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int pdss(int i)
	{
		int j;
		int r = 0;
		for (j = 2;j <= Math.sqrt(i);j++)
		{
			if (i % j == 0)
			{
				r = 1;
				break;
			}
		}
		if (r == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int cs = 0;
		int h;
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			h = pdhw(i);
			if (h == 1)
			{
				s = pdss(i);
				if (s == 1)
				{
					if (cs > 0)
					{
						System.out.print(",");
					}
					System.out.printf("%d",i);
					cs++;
				}
			}
		}
		if (cs == 0)
		{
			System.out.print("no");
		}
	}
}

