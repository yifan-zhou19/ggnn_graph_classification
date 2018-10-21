package <missing>;

public class GlobalMembers
{
	public static int fib(int finput)
	{
	int i1;
	int i2;
	int temp;
	int i;
	i1 = 1;
	i2 = 1;

	if (finput == 1 || finput == 2)
	{
	return 1;
	}


	for (i = 2;i < finput;i++)
	{
	temp = i1 + i2;
	i1 = i2;
	i2 = temp;

	}
	return i2;
	}

	public static int Main()
	{
	int number;
	int finput;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		number = Integer.parseInt(tempVar);
	}
	for (i = 0;i < number;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		finput = Integer.parseInt(tempVar2);
	}

	if (i != number - 1)
	{
	System.out.printf("%d\n",fib(finput));
	}
	else
	{
	System.out.printf("%d",fib(finput));
	}

	}

	return 0;
	}
}

