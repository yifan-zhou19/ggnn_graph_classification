package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //????
	int sum = 0;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 1;k <= n;k++)
	{
	if (yuqiwuguan(k) == 1)
	{ //???wu???????????
	sum += k * k;
	}
	}
	System.out.printf("%d",sum); //????
	return 0;
	}
	public static int yuqiwuguan(int number)
	{
	int i; //???7?????
	if (number % 7 == 0)
	{
	return 0;
	}
	for (i = number;i > 0;i /= 10)
	{
	if (i % 10 == 7)
	{
	return 0;
	}
	}
	return 1;
	}

}

