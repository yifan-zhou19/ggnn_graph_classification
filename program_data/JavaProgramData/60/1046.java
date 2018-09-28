package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int z = 1;
		if (x == 2)
		{
			return 1;
		}
		else
		{
			for (i = 2;i < x;i++)
			{
				if (x % i == 0)
				{
					z = 0;
				break;
				}
			}
		}
		return z;
	}
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	int z = 0;
		int i;
		int o = 0;
		int[] a = new int[10000];
		for (i = 2;i <= n;i++)
		{
			if (f(i) == 1)
			{
			a[o] = i;
			o++;
			}
		}


		for (i = 0;i < o;i++)
		{
			if (a[i] + 2 == a[i + 1])
			{
			System.out.printf("%d %d\n",a[i],a[i + 1]);
			z = 1;
			}

		}

	if (z == 0)
	{
		System.out.print("empty");
	}

	}

}

