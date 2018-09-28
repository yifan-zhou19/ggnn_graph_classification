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
	System.out.printf("%d\n",sum / 100);
	sum = sum - sum / 100 * 100;
	if (sum >= 50)
	{
	System.out.print("1\n");
	sum = sum - 50;
	}
	else
	{
	System.out.print("0\n");
	}
	System.out.printf("%d\n",sum / 20);
	sum = sum - sum / 20 * 20;
	System.out.printf("%d\n",sum / 10);
	sum = sum - sum / 10 * 10;
	System.out.printf("%d\n",sum / 5);
	sum = sum - sum / 5 * 5;
	System.out.printf("%d\n",sum);
	return 0;
	}
}

