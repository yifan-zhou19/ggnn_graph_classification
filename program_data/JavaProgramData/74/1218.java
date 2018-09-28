package <missing>;

public class GlobalMembers
{
	public static int f1(int x)
	{
		int c = 0;
		for (int i = 2;i <= Math.sqrt(x);i++)
		{
		if (x % i == 0)
		{
		c++;
		}
		}
		return c;
	}
	public static int f2(int x)
	{
		int a;
		int b = 0;
		while (x > 0)
		{
			  a = x % 10;
			  b = b * 10 + a;
			  x = x / 10;
		}
		return b;

	}
	public static int Main()
	{
		int m;
		int n;
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

		int[] hs = new int[1000];
		int d = 0;
		for (int i = m;i <= n;i++)
		{
			  if (f1(i) == 0 && f2(i) == i)


			  {
				  hs[d] = i;
			  d++;
			  }

		}
		if (d == 0)
		{
		System.out.print("no");
		}
		else
		{
			System.out.printf("%d",hs[0]);
			for (int p = 1;p < d;p++)
			{
			System.out.printf(",%d",hs[p]);
			}
		}
	}

}

