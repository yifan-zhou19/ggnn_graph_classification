package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int x;
		int huiwen = int x;
		int m;
		int n;
		int i;
		int j;
		int f = 0;
		int[] a = new int[100];
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
			if (sushu(i) == 1 && huiwen(i) == 1)
			{
				a[f] = i;
				f++;
			}
		}
		if (f == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (j = 0;j < (f - 1);j++)
			{
				System.out.printf("%d,",a[j]);
			}
			System.out.printf("%d",a[f - 1]);
		}
	}
	public static int sushu(int x)
	{
		int flag1;
		int k;
		int a;
		k = Math.sqrt(x);
		for (a = 2;a <= k;a++)
		{
			if (x % a == 0)
			{
				break;
			}
		}
		if (a > k)
		{
			flag1 = 1;
		}
		else
		{
			flag1 = 0;
		}
		return (flag1);
	}
	public static int huiwen(int x)
	{
		int[] a = new int[9];
		int d;
		int j;
		int b;
		int c;
		int k;
		int e;
		int y;
		int sum = 0;
		int cha;
		int flag2;
		d = 9;
		k = Math.pow(10,d);
		while ((x / k) == 0)
		{
			d--;
			k = Math.pow(10,d);
		}
		for (j = 0;j <= d;j++)
		{
			b = Math.pow(10,j + 1);
			c = Math.pow(10,j);
			a[j] = (x % b - x % c) / c;
		}
		for (j = 0;j <= d;j++)
		{
			e = Math.pow(10,d - j);
			y = a[j] * e;
			sum = sum + y;
		}
		cha = x - sum;
		if (cha == 0)
		{
			flag2 = 1;
		}
		else
		{
			flag2 = 0;
		}
		return (flag2);
	}


}

