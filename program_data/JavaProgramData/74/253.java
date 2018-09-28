package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int;
		int huiwen = int;
		int m;
		int n;
		int i;
		int[] b = new int[10000];
		int p;
		int q;
		int r = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			p = sushu(i);
			q = huiwen(i);
			if (p == 1 && q == 1)
			{
				b[j] = i;
				j++;
				r = 1;
			}
		}
		if (r == 0)
		{
			System.out.print("no");
		}
		else if (j == 1)
		{
		System.out.printf("%d",b[0]);
		}
		else if (j > 1)
		{
			System.out.printf("%d",b[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		}

	}
	public static int sushu(int m)
	{
		int i;
		int p = 1;
		for (i = 2;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				p = 0;
				break;
			}
		}
			return (p);
	}
	public static int huiwen(int m)
	{
		int i = 0;
		int j;
		int p = 1;
		int[] a = new int[100];
		int r;
		int d = 0;
		int t;
		t = m;
			while ((d = m / Math.pow(10,i)) != 0)
			{
				i++;
			}
				i--;
			for (r = 0;r <= i;r++)
			{
				a[r] = t / Math.pow(10,i - r);
				t = t - a[r] * Math.pow(10,i - r);
			}
			r--;
			for (j = 0;j < r / 2 + 1;j++)
			{
				if (a[j] != a[r - j])
				{
					p = 0;
					break;
				}
			}
			return (p);
	}







}

