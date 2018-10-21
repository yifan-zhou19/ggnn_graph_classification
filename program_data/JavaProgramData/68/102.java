package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int t = 0;
		for (i = 2;i * i < x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i * i > x)
		{
			t = 1;
		}
		return t;
	}



	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i;
		int j;
		int t1;
		int t2;
		int x;
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j < i;j = j + 2)
			{
				x = i - j;
				t1 = f(j);
				t2 = f(x);
				if (t1 == 1 && t2 == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,x);
					break;
				}
			}

		}
		return 0;
	}

}

