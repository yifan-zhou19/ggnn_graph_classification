package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10;i++)
		{
			p = i * 100;
			q = (i + 1) * 100;
			if (n > p && n < q)
			{
				System.out.printf("%d\n",i);
					break;
			}
		}
		n = n - 100 * i;
			if (n >= 50)
			{
				i = 1;
				System.out.print("1\n");
			}
			else
			{
				i = 0;
				System.out.print("0\n");
			}
		n = n - i * 50;
		for (i = 0;i < 3;i++)
		{
			p = i * 20;
			q = (i + 1) * 20;
			if (p <= n != 0 && q> n)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		n = n - i * 20;
		if (n >= 10)
		{
			i = 1;
			System.out.print("1\n");
		}
		else
		{
			i = 0;
			System.out.print("0\n");
		}
		n = n - i * 10;
		if (n >= 5)
		{
			i = 1;
			System.out.print("1\n");
		}
		else
		{
			i = 0;
			System.out.print("0\n");
		}
		n = n - i * 5;
		System.out.printf("%d",n);
		return 0;
	}
}

