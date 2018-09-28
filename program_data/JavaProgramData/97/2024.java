package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		sum = Integer.parseInt(tempVar);
	}
	int i = 0;
	while (sum >= 100)
	{
	i++;
	sum = sum - 100;
	}
	System.out.printf("%d\n",i);
	i = 0;
	while (sum >= 50)
	{
	i++;
	sum = sum - 50;
	}
	System.out.printf("%d\n",i);
	i = 0;
	while (sum >= 20)
	{
	i++;
	sum = sum - 20;
	}
	System.out.printf("%d\n",i);
	i = 0;
	while (sum >= 10)
	{
	i++;
	sum = sum - 10;
	}
	System.out.printf("%d\n",i);
	i = 0;
	while (sum >= 5)
	{
	i++;
	sum = sum - 5;
	}
	System.out.printf("%d\n",i);
	i = 0;
	while (sum >= 1)
	{
	i++;
	sum = sum - 1;
	}
	System.out.printf("%d\n",i);
	}
}

