package <missing>;

public class GlobalMembers
{
	public static int apple(int a,int b)
	{
		int i;
		int c = 0;
		if (b == 1)
		{
			return (1);
		}
		if (a == 0)
		{
			return (1);
		}
		if (a < 0)
		{
			return (0);
		}
		else
		{
			return (apple(a, b - 1) + apple(a - b, b));
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
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

