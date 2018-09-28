package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[6];
		int f = int x;
		int i;
		int j;
		int[] nf = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			if (n[i] == 0)
			{
				nf[i] = 0;
			}
			else if (n[i] < 0)
			{
				nf[i] = -1 * f(Math.abs(n[i]));
			}
			else
			{
				nf[i] = f(n[i]);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",nf[i]);
		}
		return 0;
	}
	public static int f(int x)
	{
		int i;
		int[] a = new int[20];
		int b;
		int y;
		int j;
		b = 10;
		for (i = 0;i < 20;i++)
		{
			a[i] = (x % b) / (b / 10);
			x = x - (b / 10) * a[i];
			if (x == 0)
			{
				break;
			}
			b = b * 10;
		}
		y = 0;
		b = 1;
		for (j = 0;j <= i;j++)
		{
			y = y + a[i - j] * b;
			b = b * 10;
		}
		return (y);
	}

}

