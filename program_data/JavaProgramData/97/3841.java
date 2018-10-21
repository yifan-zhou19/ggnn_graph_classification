package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] money = {100, 50, 20, 10, 5, 1};
	int n;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	y = n;
	int[] h = {0, 0, 0, 0, 0, 0};
	for (int i = 0;i < 6;i++)
	{
	if (y >= money[i])
	{
	h[i] = y / money[i];
	y = y % money[i];
	}
	}
	for (int i = 0;i < 6;i++)
	{
	System.out.printf("%d\n",h[i]);
	}
	return 0;
	}
}

