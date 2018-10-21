package <missing>;

public class GlobalMembers
{
	public static int put(int a,int b)
	{
		int s;
		if (a == 1)
		{
			s = 1;
			return s;
		}
		else if (b == 1)
		{
			s = 1;
			return s;
		}
		else if (a == 0 || b == 0)
		{
			s = 1;
			return s;
		}
		else if (a >= b)
		{
			s = put(a, b - 1) + put(a - b, b);
			return s;
		}
		else if (a < b)
		{
			s = put(a, a);
			return s;
		}
		else if (a == 0 && b == 0)
		{
			return s;
		}
	}
	public static void Main()
	{
		int t;
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",put(m, n));
		}
	}

}

