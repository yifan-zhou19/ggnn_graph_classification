package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int r = int x;
		int[] a = new int[6];
		int i;
		int x;
		int y;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			y = r(a[i]);
			System.out.printf("%d",y);
			if (i != 5)
			{
			System.out.print("\n");
			}
		}
	}
	public static int r(int x)
	{
		int y;
		int m;
		int i;
		int[] b = new int[50];
		if (x == 0)
		{
			y = 0;
		}
		else if (x < 0)
		{
			x = -x;
			m = (int) Math.log10(x);
			for (i = m;i >= 0;i--)
			{
				b[i] = (int)(x / Math.pow(10,i));
				x = x % (int)(Math.pow(10,i));
			}
			for (i = m - 1,y = b[m];i >= 0;i--)
			{
				y = y + b[i] * Math.pow(10,m - i);
			}
			y = -y;
		}
		else if (x > 0)
		{
			m = (int) Math.log10(x);
			for (i = m;i >= 0;i--)
			{
				b[i] = (int)(x / Math.pow(10,i));
				x = x % (int)(Math.pow(10,i));
			}
			for (i = m - 1,y = b[m];i >= 0;i--)
			{
				y = y + b[i] * Math.pow(10,m - i);
			}
		}
		return (y);
	}




}

