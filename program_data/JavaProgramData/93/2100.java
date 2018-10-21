package <missing>;

public class GlobalMembers
{
	public static int flag;
	public static int n;
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		flag = 0;
		if (n % 3 == 0)
		{
			System.out.print("3");
			flag = 1;
		}
		if (n % 5 == 0)
		{
			if (flag == 0)
			{
				System.out.print("5");
				flag = 1;
			}
			else
			{
				System.out.print(" 5");
			}
		}
		if (n % 7 == 0)
		{
			if (flag == 0)
			{
				System.out.print("7");
				flag = 1;
			}
			else
			{
				System.out.print(" 7");
			}
		}
		if (flag == 0)
		{
			System.out.print("n");
		}
		System.out.print("\n");
	}


}

