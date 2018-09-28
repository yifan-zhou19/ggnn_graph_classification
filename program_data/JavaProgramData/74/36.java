package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
		int o;
		for (o = 2;o <= Math.sqrt(k);o++)
		{
			if (k % o == 0)
			{
			o = 0;
			break;
			}
		}
		if (o != 0)
		{
			o = 1;
		}
		return (o);
	}
	public static int huiwen(int k)
	{
		int k2 = 0;
		int o;
		int x;
		x = k;
		while (x >= 10)
		{
			o = x % 10;
			k2 = 10 * k2 + o;
			x = x / 10;
		}
		k2 = 10 * k2 + x;
		if (k == k2)
		{
			o = 1;
		}
		else
		{
			o = 0;
		}
		return (o);
	}

	public static void Main()
	{
		int sushu = int k;
		int huiwen = int k;
		int m;
		int n;
		int i;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0)
			{
				if (huiwen(i) != 0)
				{
					if (f == 0)
					{
						System.out.printf("%d",i);
						f = 1;
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
		if (f == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

