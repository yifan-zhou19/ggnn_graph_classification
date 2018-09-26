package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int put = new int(int,int);
		int m;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",put(a, b));
		}
		return 0;
	}

	public static int put(int a,int b)
	{
		int n;
		if (a == 1 || b == 1)
		{
			n = 1;
		}
		else
		{
			if (a - b > 0)
			{
				n = put(a - b, b) + put(a, b - 1);
			}
			else
			{
				if (a - b < 0)
				{
					n = put(a, b - 1);
				}
				else
				{
				n = 1 + put(a, b - 1);
				}

			}
		}
		return n;
	}

}

