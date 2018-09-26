package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int a;
		int i;
		int n;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		h = 0;
		for (i = 3;i <= (n - 2);i++)
		{
			if (f(i) == 1 && f(i + 2) == 1)

			{
				h++;
			   System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (h == 0)
		{
			System.out.print("empty");
		}


		return 0;

	}
	public static int f(int a)
	{
		int m;
		int i;
		int n;
		m = 0;
		n = 0;
		for (i = 1;i <= a;i++)
		{
			if (a % i == 0)
			{
				m++;
			}
		}
		if (m == 2)
		{
			n = 1;
		}
		return (n);
	}

}

