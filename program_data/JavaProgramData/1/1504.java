package <missing>;

public class GlobalMembers
{
	public static int fenjie(int x,int b)
	{
		int i;
		int z = 0;
		int c;
		for (i = b;i <= x;i++)
		{
			if (x == i)
			{
				z = z + 1;
			}
			else if (x % i == 0)
			{
				c = x / i;
				z = z + fenjie(c, i);
			}

		}
		return (z);
	}
	public static void Main()
	{
		int n;
		int i;
		int num;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			num = fenjie(a, 2);
			System.out.printf("%d\n",num);
		}

	}




}

