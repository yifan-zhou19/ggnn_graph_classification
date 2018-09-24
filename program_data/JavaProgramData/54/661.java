package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int i = 0;
	int j = 0;
	int b = 0;
	j = n - 1;
	do
	{
		b = j;
		j = j + n - 1;
	for (i = 0;i <= n;)
	{
		if (b % (n - 1) == 0)
		{
		b = b / (n - 1) * n + k;
		i++;
		}
	else
	{
		break;
	}
	}
	if (i != n)
	{
		continue;
	}
	else
	{
		break;
	}
	}while (i != n);
	System.out.printf("%d\n",b);
	}
}

