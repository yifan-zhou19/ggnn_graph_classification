package <missing>;

public class GlobalMembers
{
	public static int im(int n,int max)
	{
		int s = 0;
		int i;
		if (n == 1)
		{
		return 1;
		}
		for (i = max;i > 1;i--)
		{
		if (n % i == 0)
		{
		s += im(n / i, i);
		}
		}
		return s;
	}
	public static int Main()
	{
		int i;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",im(t, t));
		for (i = 1;i < n;i++)
		{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							t = Integer.parseInt(tempVar3);
						}
						System.out.printf("\n%d",im(t, t));
		}
		//getch();
		return 0;
	}

}

