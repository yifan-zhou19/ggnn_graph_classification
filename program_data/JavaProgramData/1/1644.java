package <missing>;

public class GlobalMembers
{
	public static int fi(int a, int k)
	{
		int i;
		int b = 1;
		if (a == 1)
		{
			return 0;
		}
		for (i = k;i * i <= a;i++)
		{
			if (a % i == 0)
			{
				b = b + fi(a / i, i);
			}
		}
		return b;
	}
	public static void Main()
	{
		int a;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fi(a, 2));
		}
	}
}

