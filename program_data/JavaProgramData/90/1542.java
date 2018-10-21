package <missing>;

public class GlobalMembers
{
	public static int apple(int a,int b)
	{
		if (b == 1)
		{
			return b;
		}
		else if (a > b)
		{
			return apple(a, b - 1) + apple(a - b, b);
		}
		else if (a < b)
		{
			return apple(a, b - 1);
		}
		else
		{
			return apple(a, b - 1) + 1;
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			c = apple(a, b);
			System.out.printf("%d\n",c);
		}
	}
}

