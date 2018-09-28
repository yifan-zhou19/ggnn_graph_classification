package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	void operate(int x);
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	operate(n);
	}

	public static void operate(int x)
	{
	int y;
	if (x == 1)
	{
		System.out.print("End");
		return;
	}
	else if (x % 2 == 1)
	{
		y = x;
		x = x * 3 + 1;
		System.out.printf("%d*3+1=%d\n",y,x);
	}
	else if (x % 2 == 0)
	{
		y = x;
		x = x / 2;
		System.out.printf("%d/2=%d\n",y,x);
	}
	operate(x);
	}
}

