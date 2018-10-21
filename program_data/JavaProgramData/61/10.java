package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int f = int j;
	int n;
	int i;
	int j;
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
		j = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d\n",f(j));

	}

	}
	public static int f(int j)
	{
	int x = 0;
	if (j == 1 || j == 2)
	{
		x = 1;
	}
	else
	{
		x = f(j - 1) + f(j - 2);
	}
	return x;


	}
}

