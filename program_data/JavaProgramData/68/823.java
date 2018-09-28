package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
	int k = 0;
	int i = 0;
	int o = 0;
	if (x % 2 == 0)
	{
	 return 0;
	}
	else
	{
	 for (i = 3;i <= Math.sqrt(x);i += 2)
	 {
	if (x % i == 0)
	{
	 return 0;
	o++;
	break;
	}
	 }
	if (o == 0)
	{
	 return 1;
	}
	}
	}
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int j = 0;
		for (i = 6;i <= n;i = i + 2)
		{
			System.out.printf("%d=",i);
			for (j = 3;j <= i;j = j + 2)
			{
				if (f(j) == 1 && f(i - j) == 1)
				{
					System.out.printf("%d+%d\n",j,i - j);
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

