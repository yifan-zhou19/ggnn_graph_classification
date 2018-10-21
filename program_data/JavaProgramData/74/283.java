package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		if (n == 2)
		{
			return 1;
		}
		if (n % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i <= Math.sqrt(n);i += 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int huiwen(int n)
	{
		int l;
		int[] a = new int[10];
		int i;
		int m;
		int p;
		l = Math.log10(n) + 1;
		for (i = 1;i <= l;i++)
		{
			p = Math.pow(10,i);
			a[i - 1] = (n % p) / Math.pow(10,i - 1);
		}
		for (i = 0,m = 0;i < l;i++)
		{
			m += a[l - 1 - i] * Math.pow(10,i);
		}
		if (n == m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int a;
		int b;
		int j;
		int k;
		int[] out = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (j = a,k = 0;j <= b;j++)
		{
			if (sushu(j) != 0 && huiwen(j) != 0)
			{
				out[k] = j;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (j = 0;j < k - 1;j++)
			{
				System.out.printf("%d,",out[j]);
			}
			System.out.printf("%d",out[k - 1]);
		}
	}
}

