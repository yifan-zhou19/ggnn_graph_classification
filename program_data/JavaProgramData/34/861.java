package <missing>;

public class GlobalMembers
{
	public static int isjishu(int x)
	{
		int temp1 = x;
		x = x * 3 + 1;
		System.out.printf("%d*3+1=%d\n",temp1,x);
		return x;
	}
	public static int isoushu(int y)
	{
		int temp2 = y;
		y = y / 2;
		System.out.printf("%d/2=%d\n",temp2,y);
		return y;
	}
	public static int Main()
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;;)
		{
			if (n == 1)
			{
				break;
			}
			if (n % 2 == 0)
			{
				n = isoushu(n);
			}
			else
			{
				n = isjishu(n);
			}

		}
		System.out.print("End");
		return 0;
	}

}

