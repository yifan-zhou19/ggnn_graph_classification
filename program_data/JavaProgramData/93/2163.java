package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int flag = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	if (m % 3 == 0)
	{
		System.out.print("3");
	}
	if (m % 5 == 0)
	{
		if (m % 3 == 0)
		{
			System.out.print(" ");
		}
		System.out.print("5");
	}
	if (m % 7 == 0)
	{
		if (m % 3 == 0 || m % 5 == 0)
		{
			System.out.print(" ");
		}
		System.out.print("7");
	}
	else if (m % 3 != 0 && m % 5 != 0)
	{
		System.out.print('n');
	}
	}

}

