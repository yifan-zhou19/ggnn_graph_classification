package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int change = int;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
		}
		else
		{
			do
			{
				n = change(n);
			}while (n != 1);
			System.out.print("End\n");
		}
		return 0;
	}

	public static int change(int n)
	{
		int a;
		if (n % 2 == 0)
		{
			a = n / 2;
			System.out.printf("%d/2=%d\n",n,a);
		}
		else
		{
			a = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,a);
		}
		return a;
	}
}

