package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ????????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?9?24? 
	//*************************

	public static int digui(int a)
	{
		if (a == 1)
		{
		   return 1;
		}
		if (a == 2)
		{
			return 1;
		}
		if (a > 2)
		{
			return digui(a - 1) + digui(a - 2);
		}
	}

	public static int Main()
	{
		int i;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(digui(a));
			System.out.print("\n");
			System.out.print("\n");
		}
		return 0;
	}

}

