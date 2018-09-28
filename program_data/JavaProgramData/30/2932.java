package <missing>;

public class GlobalMembers
{
	public static int mm(int i)
	{
		int j;
		if (i % 7 == 0)
		{
		return 0;
		}
	for (j = i;j > 0;j /= 10)
	{
		if (j % 10 == 7)
		{
	return 0;
		}
	}
	return 1;
	}
	public static void Main(String[] args)
	{
		 int i;
		 int n;
		 int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 1,sum = 0;i <= n;i++)
	{
		if (mm(i) == 1)
		{
		sum += i * i;
		}
	}
		System.out.printf("%d",sum);
	}
}

