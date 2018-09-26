package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int m1;
		int m2;
		int k;
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
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			k = cmp(y, m1, m2);
			if (k != 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
	public static int cmp(int y,int m1,int m2)
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int s = 0;
		int t1;
		int t2;
		if (((y % 4 == 0) && (y % 100) != 0) || y % 400 == 0)
		{
			a[1] = 29;
		}
		t1 = (m1 > m2 != 0? m1:m2);
		t2 = (m1 > m2 != 0? m2:m1);
		for (i = t2;i < t1;i++)
		{
			s += a[i - 1];
		}
		return (s % 7 == 0? 1:0);
	}
}

