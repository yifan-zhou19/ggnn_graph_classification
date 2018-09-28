package <missing>;

public class GlobalMembers
{
	public static int fan(int x)
	{
		int i;
		int[] a = new int[100];
		int[] b = new int[200];
		int sign = 0;
		int c = 0;
		if (x >= 0)
		{
			for (i = 1;;i++)
			{
				b[i] = x % 10;
				x = (x - b[i]) / 10;
				sign += 1;
				if (x == 0)
				{
					break;
				}
			}
			for (i = sign;i >= 1;i--)
			{
				c += b[i] * Math.pow(10,sign - i);
			}
			return c;
		}
		if (x < 0)
		{
			x = -1 * x;
			for (i = 1;;i++)
			{
				b[i] = x % 10;
				x = (x - b[i]) / 10;
				sign += 1;
				if (x == 0)
				{
					break;
				}
			}
			for (i = sign;i >= 1;i--)
			{
				c += b[i] * Math.pow(10,sign - i);
			}
			return -1 * c;
		}

	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		a[i] = fan(a[i]);


		}
		for (i = 0;i <= 5;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}






}

