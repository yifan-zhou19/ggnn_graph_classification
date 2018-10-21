package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int flag3 = 0;
		int flag5 = 0;
		int flag7 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		if (k % 3 == 0)
		{
			System.out.print("3");
		flag3 = 1;
		}
		if (k % 5 == 0)
		{
			flag5 = 1;
			if (flag3 == 0)
			{
				System.out.print("5");
			}
			else
			{
				System.out.print(" 5");
			}
		}
		if (k % 7 == 0)
		{
			flag7 = 1;
			if (flag3 == 1 || flag5 == 1)
			{
				System.out.print(" 7");
			}
			else
			{
				System.out.print("7");
			}
		}
		if (flag3 == 0 && flag5 == 0 && flag7 == 0)
		{
			System.out.print("n");
		}
		System.out.print("\n");
	}



}

