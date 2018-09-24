package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int f = new int(int x,int min); //f:???????

		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}

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
				a[i] = Integer.parseInt(tempVar2);
			}
			a[i] = f(a[i], 2);
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}


		return 0;
	}

	public static int f(int x,int min)
	{
		int y = 0;
		int i;

		if (x == 1)
		{
			y = 1;
		}

		else
		{
		  for (i = min;i <= x;i++)
		  {
			if (x % i == 0)
			{
				y = y + f(x / i, i);
			}
		  }
		}

		return y;
	}
}

