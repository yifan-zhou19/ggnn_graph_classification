package <missing>;

public class GlobalMembers
{
	public static int rev(int a)
	{
		int m;
		int n = 0;
		int j;
		for (j = 0;j < 10;j++)
		{
			m = a % 10;
			a = a / 10;
			n = n * 10 + m;
			if (a == 0)
			{
				break;
			}
		}
		return n;
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = rev(a);
		System.out.printf("%d\n",b);
		}
		return 0;
	}


}

