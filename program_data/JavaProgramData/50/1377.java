package <missing>;

public class GlobalMembers
{
	public static int day;
	public static int bujili(int m)
	{
		int i;
		int s = 0;
		int d;
		int a = 0;
		for (i = 1;i < m;i++)
		{
			s += tianshu(i);
		}
		s += 12;
		d = (s % 7 + day) % 7;
		//if(d>7){d=d-7;}
		if (d == 5)
		{
			System.out.printf("%d\n",m);
		}
		return a;
	}
	public static int tianshu(int m)
	{
		int t = 31;
		if (m == 2)
		{
			t = 28;
		}
		if (m == 4 || m == 6 || m == 9 || m == 11)
		{
			t = t - 1;
		}
		return t;
	}
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			day = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			bujili(i);
		}
		return 0;
	}
}

