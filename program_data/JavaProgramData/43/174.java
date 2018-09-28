package <missing>;

public class GlobalMembers
{
	public static int is(int x)
	{
		int i;
		int res = 1;
		if (x % 2 == 0)
		{
			res = 0;
		}
		for (i = 3;i <= x / 2;i++)
		{
			if (x % i == 0)
			{
				res = 0;
				break;
			}
		}
		return res;
	}
	public static int Main()
	{
		int i = 3;
		int input;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = Integer.parseInt(tempVar);
		}
		while (i <= input / 2)
		{
			if (is(i) == 0 || is(input - i) == 0)
			{
				;
			}
			else
			{
				System.out.printf("%d %d\n",i,input - i);
			}
			i++;
		}


	}

}

