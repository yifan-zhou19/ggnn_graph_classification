package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int n)
	{
		if (n % 2 == 1)
		{
			n = n * 3 + 1;
		}
		else
		{
			n = n / 2;
		}
		return (n);
	}
	public static void Main()
	{
		int jiaogu = int n;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
		while (jiaogu(n) != 1)
		{
			int k;
			k = n;
			if (n % 2 == 1)
			{
				System.out.printf("%d*3+1=%d\n",k,jiaogu(n));
			}
			else
			{
				System.out.printf("%d/2=%d\n",k,jiaogu(n));
			}
			n = jiaogu(n);
		}
		System.out.print("2/2=1\n");
		System.out.print("End");
		}
	}
}

