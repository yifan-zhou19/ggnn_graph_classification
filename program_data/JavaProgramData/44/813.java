package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int sgn;
		int[] a = new int[1000];
		int i;
		int j;
		int t;
		int k;
		int x = 0;
		int u;
		int real;
		i = 1;
		real = Math.abs(num);
		if (num == 0)
		{
			return 0;
		}
		else
		{
			if (num > 0)
			{
				sgn = 1;
			}
			if (num < 0)
			{
				sgn = -1;
			}
			while (real != 0) //????i??
			{
				a[i - 1] = real % 10;
				real /= 10;
				i++;
			}
			for (j = i;j >= 1;j--)
			{
				u = 1;
				for (k = 1;k <= i - j;k++)
				{
					u *= 10;
				}
				x += u * a[j - 1];
			}
			return sgn * x / 10;
		}
	}

	public static void Main()
	{
		int i;
		int num;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(num));
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
	}

}

