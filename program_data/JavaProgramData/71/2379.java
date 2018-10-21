package <missing>;

public class GlobalMembers
{
	public static int mo1 = 31;
	public static int mo2 = 28;
	public static int mo3 = 31;
	public static int mo4 = 30;
	public static int mo5 = 31;
	public static int mo6 = 30;
	public static int mo7 = 31;
	public static int mo8 = 31;
	public static int mo9 = 30;
	public static int mo10 = 31;
	public static int mo11 = 30;
	public static int mo12 = 31;
	public static int f(int x)
	{
		if (x == 1)
		{
			return 0;
		}
		if (x == 2)
		{
			return (mo1);
		}
		if (x == 3)
		{
			return (mo1 + mo2);
		}
		if (x == 4)
		{
			return (mo1 + mo2 + mo3);
		}
		if (x == 5)
		{
			return (mo1 + mo2 + mo3 + mo4);
		}
		if (x == 6)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5);
		}
		if (x == 7)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5 + mo6);
		}
		if (x == 8)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5 + mo6 + mo7);
		}
		if (x == 9)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5 + mo6 + mo7 + mo8);
		}
		if (x == 10)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5 + mo6 + mo7 + mo8 + mo9);
		}
		if (x == 11)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5 + mo6 + mo7 + mo8 + mo9 + mo10);
		}
		if (x == 12)
		{
			return (mo1 + mo2 + mo3 + mo4 + mo5 + mo6 + mo7 + mo8 + mo9 + mo10 + mo11);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int y;
		int m1;
		int m2;
		while (n-- != 0)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m2 = Integer.parseInt(tempVar4);
		}
		mo2 = 28;
		if (y % 400 == 0 || (y % 4 == 0) && (y % 100 != 0))
		{
		mo2 = 29;
		}
		if (m1 > m2)
		{
		m = f(m1) - f(m2);
		}
		else
		{
			m = f(m2) - f(m1);
		}
		if (m % 7 == 0)
		{
		System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}
	}


}

