package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{

		if (a >= b)
		{
				return a;
		}
			else
			{
				return b;
			}
	}
	public static int min(int a,int b)
	{
		if (a >= b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}

	public static void Main()
	{

		int i;
		int c;
		int n;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			b = max(min(a, c), min(a, b));
			a = max(a, c);
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);

	}

}

