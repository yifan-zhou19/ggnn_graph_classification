package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void odd(int); //??
		void even(int); //??
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 2 == 0)
		{
			even(n);
		}
		else if (n != 1)
		{
			odd(n);
		}
		else
		{
			System.out.print("End");
		}
		return 0;
	}
	public static void odd(int n)
	{
		void even(int);
		int m;
		m = n * 3 + 1;
		System.out.printf("%d*3+1=%d\n",n,m);
		if (m % 2 == 0)
		{
			even(m);
		}
		else if (m != 1)
		{
			odd(m);
		}
		else
		{
			System.out.print("End");
		}
	}
	public static void even(int n)
	{
		int m;
		m = n / 2;
		System.out.printf("%d/2=%d\n",n,m);
		if (m % 2 == 0)
		{
			even(m);
		}
		else if (m != 1)
		{
			odd(m);
		}
		else
		{
			System.out.print("End");
		}
	}
}

