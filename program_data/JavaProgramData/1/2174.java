package <missing>;

public class GlobalMembers
{
	public static int divide(int a,int b)
	{
		int i;
		int r;
		r = 1;
		for (i = b;i < a;i++)
		{
						if (((a / i) * i) == a && (a / i) >= i)
						{
							r = r + divide(a / i, i);
						}
		}
		return r;
	}
	public static int Main()
	{
		int s;
		int p;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							p = Integer.parseInt(tempVar2);
						}
						s = divide(p, 2);
						System.out.printf("%d\n",s);
		}
	}
}

