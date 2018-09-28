package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int x;
		int i;
		int p;
		int t;
		int j;
		int n = 0;
		if (a == 0)
		{
			return (0);
		}
		x = Math.abs(a);
		for (i = 9,p = 0,j = 0;i >= 0;i--)
		{
			t = x / ((int)Math.pow(10,i));
			x -= t * (int)Math.pow(10,i);
			if ((t != 0) || (p == 1))
			{
				p = 1;
				n += t * Math.pow(10,j);
				j++;
			}
		}
		if (a < 0)
		{
			n = -n;
		}
		return (n);
	}

	public static void Main()
	{
		int a;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(a));
		}
	}
}

