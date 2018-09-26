package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (n % 3 == 0 && n % 5 == 0)
		{
			System.out.print("3 5");
		}
		else if (n % 3 == 0 && n % 7 == 0)
		{
			System.out.print("3 7");
		}
		else if (n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("5 7");
		}
		else if (n % 3 == 0)
		{
			System.out.print("3");
		}
		else if (n % 5 == 0)
		{
			System.out.print("5");
		}
		else if (n % 7 == 0)
		{
			System.out.print("7");
		}
		else if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
		{
			System.out.print("n");
		}




		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}


}

