package <missing>;

public class GlobalMembers
{
	public static int issushu(int number)
	{
	int i;
	for (i = 2;i < number;i++)
	{
		if (number % i == 0)
		{
		return 0;
		}
	}
	return 1;
	}
	public static int Main()
	{
	int n;
	int i;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 3;i + 2 <= n;i = i + 2)
	{
		int p = 0;
		if (issushu(i) != 0)
		{
			if (issushu(i + 2) != 0)
			{
			s = i;
			p = i + 2;
			System.out.printf("%d %d\n",s,p);
			}
		}
	}
	if (s == 0)
	{
	System.out.print("empty");
	}
	return 0;
	}

}

