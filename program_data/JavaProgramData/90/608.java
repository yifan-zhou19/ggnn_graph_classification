package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int func1 = new int(int m,int n);
		int t;
		int m;
		int n;
		int result;
		int i;
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
			result = func1(m, n);
			System.out.printf("%d\n",result);
		}
		return 0;
	}


	public static int func1(int m,int n)
	{
		int result1;
		if (m >= n)
		{
			if (n == 1) //????????????????????
			{
				result1 = 1;
			}
			else if (n >= 2)
			{
				result1 = func1(m, n - 1) + func1(m - n, n);
			}
		}
		if (m < n)
		{
			if (n == 1) //????????????????????
			{
				result1 = 1;
			}
			else if (n >= 2)
			{
				result1 = func1(m, n - 1);
			}
		}
		return result1;
	}
}

