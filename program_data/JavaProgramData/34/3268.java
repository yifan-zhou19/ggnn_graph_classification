package <missing>;

public class GlobalMembers
{
	public static void count(int n)
	{
		int a;
		int b;
		int i;
		int j;
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			if (n % 2 != 0)
			{
				a = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,a);
				n = a;
				count(n);
			}
			else
			{
				b = n / 2;
				System.out.printf("%d/2=%d\n",n,b);
				n = b;
				count(b);
			}
		}
	}

	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		count(n);

	}
}

