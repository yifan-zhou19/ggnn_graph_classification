package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int t;
	public static int cnt;
	public static void f(int left,int last)
	{
		if (left < last)
		{
			if (left == 1)
			{
				cnt++;
			}
			return;
		}
		for (int i = last;i <= left;i++)
		{
			if (left % i == 0)
			{
				f(left / i, i);
			}
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			cnt = 0;
			f(n, 2);
			System.out.printf("%d\n",cnt);
		}
		return 0;
	}

}

