package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			flag1 = 1;
		}
		if (n % 5 == 0)
		{
			flag2 = 1;
		}
		if (n % 7 == 0)
		{
			flag3 = 1;
		}

		if (flag1 == 1 && flag2 == 1 && flag3 == 1)
		{
			System.out.print("3 5 7");
		}

		if (flag1 == 1 && flag2 == 1 && flag3 == 0)
		{
			System.out.print("3 5");
		}


		if (flag2 == 1 && flag3 == 1 && flag1 == 0)
		{
			System.out.print("5 7");
		}


		if (flag1 == 1 && flag3 == 1 && flag2 == 0)
		{
			System.out.print("3 7");
		}


		if (flag1 == 0 && flag2 == 0 && flag3 == 0)
		{
			System.out.print("n");
		}

		if (flag1 == 1 && flag2 == 0 && flag3 == 0)
		{
			System.out.print("3");
		}
		if (flag1 == 0 && flag2 == 1 && flag3 == 0)
		{
			System.out.print("5");
		}
		if (flag1 == 0 && flag2 == 0 && flag3 == 1)
		{
			System.out.print("7");
		}

	}





}

