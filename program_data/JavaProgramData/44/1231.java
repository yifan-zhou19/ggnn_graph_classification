package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a = int num;
		int s;
		int i = 0;
	while (i < 6)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = a(n);
		System.out.printf("%d\n",s);
		i++;
	}
	}

	public static int a(int num)
	{
		int x = 0;
		while (num != 0)
		{
			x = x * 10 + num % 10;
			num /= 10;
		}
	 return x;
	}
}

