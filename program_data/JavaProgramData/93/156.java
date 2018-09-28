package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
		sum = sum + 3;
		}
		if (a % 5 == 0)
		{
		sum = sum + 5;
		}
		if (a % 7 == 0)
		{
		sum = sum + 7;
		}
		if (sum == 0)
		{
		System.out.print("n");
		}
		if (sum == 3)
		{
		System.out.print("3");
		}
		if (sum == 5)
		{
		System.out.print("5");
		}
		if (sum == 7)
		{
		System.out.print("7");
		}
		if (sum == 8)
		{
		System.out.print("3 5");
		}
		if (sum == 10)
		{
		System.out.print("3 7");
		}
		if (sum == 12)
		{
		System.out.print("5 7");
		}
		if (sum == 15)
		{
		System.out.print("3 5 7");
		}
		return 0;
	}

}

