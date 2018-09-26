package <missing>;

public class GlobalMembers
{
	public static int sort(int a, int b)
	{
		System.out.printf("%d\n",a / b);
		return a % b;
	}
	public static int Main()
	{
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		money = sort(money, 100);
		money = sort(money, 50);
		money = sort(money, 20);
		money = sort(money, 10);
		money = sort(money, 5);
		money = sort(money, 1);
		return 0;
	}
}

