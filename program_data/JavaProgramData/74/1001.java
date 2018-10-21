package <missing>;

public class GlobalMembers
{
	public static int hui(int x)
	{
		int i;
		int p;
		int sum = 0;
		int temp;
		temp = x;
		for (i = 1;;i++)
		{
		if (x / (int)Math.pow(10,i) == 0)
		{
			break;
		}
		}
		p = i;
		for (i = p;i > 0;i--)
		{
			sum = sum * 10 + temp % 10;
			temp = temp / 10;
		}
		if (sum == x)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int su(int x)
	{
		int i;
		int q;
		q = Math.sqrt(x);
		for (i = 2;i <= q;i++)
		{
		if (x % i == 0)
		{
			break;
		}
		}
		if (i <= q)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t = 0;
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
			if (hui(i) == 1)
			{
						 if (su(i) == 1)
						 {
									 System.out.printf("%d",i);
									 for (j = i + 1;j <= n;j++)
									 {
									 if (su(j) == 1 && hui(j) == 1)
									 {
										 break;
									 }
									 }
									 if (j <= n)
									 {
										 System.out.print(",");
									 }
						 }
						 else
						 {
							 t++;
						 }
			}
			else
			{
				t++;
			}
		}
		if (t == n - m + 1)
		{
			System.out.print("no");
		}
	}

}

