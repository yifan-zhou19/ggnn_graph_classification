package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int t;
	public static int cnt;
	public static void f(int x,int left,int last)
	{
		//9("%d %d %d\n",x,left,last);
		if (x > n)
		{
			if (left == 0)
			{
				cnt++;
			}
			return;
		}
		for (int i = last;i <= left / (n - x + 1);i++)
		{
			f(x + 1, left - i, i);
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			cnt = 0;
			f(1, m, 0);
			System.out.printf("%d\n",cnt);
		}
		return 0;
	}

}

