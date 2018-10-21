package <missing>;

public class GlobalMembers
{
	public static int EVEN(int a)
	{
		System.out.printf("%d/2=%d\n",a,a / 2);
		a = a / 2;
		return a;
	}
	public static int ODD(int b)
	{
		System.out.printf("%d*3+1=%d\n",b,b * 3 + 1);
		b = b * 3 + 1;
		return b;
	}
	public static int Main()
	{
		int d = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;d != 5;i++)
		{
			if (n == 1)
			{
				d = 5;
				System.out.print("End\n");
			}
			else
			{
				if (n % 2 == 0)
				{
					n = EVEN(n);
				}
				else
				{
					n = ODD(n);
				}
			}
		}
	}
}

