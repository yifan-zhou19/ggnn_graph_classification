package <missing>;

public class GlobalMembers
{
	public static int reserve(int num)
	{
	int x;
	int y;
	y = 0;
	if (num == 0)
	{
		return 0;
	}
	while (num != 0)
	{
	x = num % 10;
	y = y * 10 + x;
	num = (num - x) / 10;
	}
	return y;
	}
	public static int Main()
	{
	int z;
	int i;
	for (i = 1;i <= 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		z = Integer.parseInt(tempVar);
	}
	System.out.printf("%d\n",reserve(z));
	}
	}



}

