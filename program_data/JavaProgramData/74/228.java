package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sel(int x);
		int sus = int p;
		int hui = int q;
		int[] a = new int[100];
		int i;
		int j;
		int k;
		int m;
		int n;
		int sing = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
		if (sus(i) == 1 && hui(i) == 1)
		{
			System.out.printf("%d",i);
			break;
		}
		}
		if (i == n + 1)
		{
			System.out.print("no");
		}
		for (i = i + 1;i <= n;i++)
		{
		 sel(i);
		}
	}
	public static void sel(int x)
	{
		int sus = int p;
		int hui = int q;
		if (sus(x) == 1 && hui(x) == 1)
		{
		System.out.printf(",%d",x);
		}
	}
	public static int sus(int p)
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		for (i = 2;i < p;i++)
		{
			if (p % i == 0)
			{
				break;
			}
		}
		if (i == p)
		{
		return (1);
		}
		else
		{
			return (0);
		}
	}

	public static int hui(int q)
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int b = 0;
		int[] a = new int[1000];
		int[] c = new int[1000];
		for (i = 0;;i++)
		{
			if (Math.pow(10,i) > q)
			{
				n = i;
				break;
			} //q?n??//
		}
		for (i = 1;i <= n;i++)
		{
			c[i] = Math.pow(10,i);
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = (q % c[i]) / (Math.pow(10,i - 1));
		}
		for (i = 1,j = n - 1;i <= n,j >= 0;i++,j--)
		{
			b = b + a[i] * Math.pow(10,j);
		}
		if (q == b)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}



}

