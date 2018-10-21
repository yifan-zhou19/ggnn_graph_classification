package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int fz;
		int w;
		int g;
		int k;
		int t;
		int a;
		fz = 0;
		w = 0;
		if (num <= 0)
		{
			t = -1;
			num = -num;
		}
		else
		{
			t = 1;
		}
			a = num;
		while (num / 10 >= 1)
		{
			w = w + 1;
			num = num / 10;
		}
		num = a;
		for (k = 0;k <= w;k++)
		{
			g = Math.pow(10,w - k);
			fz = fz + (num % 10) * g;
			num = num / 10;
		}
		return t * fz;
	}
	public static int Main()
	{
		int m;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(m));
		}
		return 0;
	}
}

