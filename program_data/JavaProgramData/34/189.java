package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		void print1(int n);
		void print2(int n);
		int printf1 = int n;
		int printf2 = int n;
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			int i;
			for (;n != 1;)
			{
				if (n % 2 == 0)
				{
					print1(n);
					n = printf1(n);
				}
				else
				{
					print2(n);
					n = printf2(n);
				}
			}
			System.out.print("End\n");
		}
	}
	public static int printf1(int n)
	{
		int m;
		m = n / 2;
		return m;
	}
	public static void print1(int n)
	{
		System.out.printf("%d/2=%d\n",n,n / 2);
	}
	public static int printf2(int n)
	{
		int m;
		m = n * 3 + 1;
		return m;
	}
	public static void print2(int n)
	{
		System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
	}





}

