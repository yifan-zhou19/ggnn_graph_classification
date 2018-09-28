package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int b;
		int i = 0;
		for (b = 2;b <= Math.sqrt(x);b++)
		{
			if (x % b == 0)
			{
				i++;
				break;
			}
			else
			{
				continue;
			}
		}
		if (i == 0)
		{
		return 0;
		}
		else
		{
			return x;
		}
	}
	public static void Main(String[] args)
	{
	int n;
	int x;
	int b;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (x = 6;x <= n;x += 2)
	{
		for (b = 2;b <= x / 2;b++)
		{
				c = x - b;
				if (sushu(b) == 0 && sushu(c) == 0)
				{
					System.out.printf("%d=%d+%d\n",x,b,c);
					break;
				}
				else
				{
					continue;
				}
		}
	}

	}
}

