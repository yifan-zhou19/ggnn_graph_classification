package <missing>;

public class GlobalMembers
{
	public static int one(int n)
	{
		if (n != 1)
		{
			if (n % 2 != 0)
			{
				System.out.printf("%d*3+1=%d\n",n,(n * 3 + 1));
				n = n * 3 + 1;
			}
			else
			{
				System.out.printf("%d/2=%d\n",n,(n / 2));
				n = n / 2;
			}
		}
		else
		{
			n = -1;
			System.out.print("End");
		}
		return n;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			n = one(n);
		} while (n != -1);
		return 0;
	}
}

