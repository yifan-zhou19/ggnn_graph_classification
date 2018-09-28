package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
	if (x % 2 == 0)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	}
	public static int Main()
	{

	int n;
	int[] number = new int[500];
	int count;
	int i;
	int p;
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
			number[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (p = 0;p < n - 1;p++)
		{
			if (number[p] > number[p + 1])
			{
				number[p] += number[p + 1];
				number[p + 1] = number[p] - number[p + 1];
				number[p] -= number[p + 1];
			}
		}
	}
	count = 0;
	for (i = 0;i < n;i++)
	{
	if (judge(number[i]) != 0 && count == 0)
	{
		System.out.printf("%d",number[i]);
		count = 1;
		continue;
	}
	if (judge(number[i]) != 0 && count == 1)
	{
		System.out.printf(",%d",number[i]);
	}
	}







	return 0;
	}
}

