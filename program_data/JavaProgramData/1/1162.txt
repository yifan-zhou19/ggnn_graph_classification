package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y);
		int n;
		int i;
		int[] a = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(a[i], 2));
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}
	public static int f(int x,int y)
	{
		int s;
		int j;
		int k;
		int l;
		int m;
		int n;
		if (x == 1)
		{
			s = 1;
		}
		else if (y > x)
		{
			s = 0;
		}
		else
		{
			for (l = 1;l <= x;l++)
			{
				k = 0;
				if (x % l == 0)
				{
					k = k + 1;
				}
			}
			if (k == 2)
			{
				s = 1;
			}
		else
		{
			s = 0;
			for (j = y;j <= x;j++)
			{

				if (x % j == 0)
				{
					s = s + f(x / j, j);
				}
			}

		}
		}
			return s;
	}
}

