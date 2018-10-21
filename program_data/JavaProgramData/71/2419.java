package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20];
	public static int Main()
	{
		void run(int x,int y);
		void ping(int x,int y);
		int n;
		int i;
		int j;
		int k;
		int year;
		int y;
		int r;
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
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				r = Integer.parseInt(tempVar4);
			}
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			{
			run(y, r);
			}
			else
			{
				ping(y, r);
			}
		}
	}
	public static void run(int x,int y)
	{
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
		a[4] = a[6] = a[9] = a[11] = 30;
		a[2] = 29;
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		m = x > y != 0?x:y;
		n = x < y != 0?x:y;
		for (i = n;i < m;i++)
		{
		k = k + a[i];
		}
		if (k % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
	public static void ping(int x,int y)
	{
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
		a[2] = 28;
		a[4] = a[6] = a[9] = a[11] = 30;
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		m = x > y != 0?x:y;
		n = x < y != 0?x:y;
		for (i = n;i < m;i++)
		{
		k = k + a[i];
		}
		if (k % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}

}

