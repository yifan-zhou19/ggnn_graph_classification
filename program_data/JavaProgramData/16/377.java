package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	int[] b = {0, 0, 0, 0, 0, 0};
	int[] c = {-1, -1, -1, -1, -1};
	b[0] = a;
	int i;
	for (i = 1;i < 5;i++)
	{
		b[i] = b[i - 1] / 10;
	}
	for (i = 0;i < 5;i++)
	{
		if (b[i] != 0)
		{
			c[i] = b[i] - 10 * b[i + 1];
		if (c[i] >= 0)
		{
			System.out.printf("%d",c[i]);
		}
		}
	}
	if (a == 0)
	{
		System.out.print("0");
	}
	}

}

