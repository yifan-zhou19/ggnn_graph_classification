package <missing>;

public class GlobalMembers
{
	///#define main xmain


	public static int Main()
	{
		int i;
		int n;
		double a;
		double b;
		double c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		c = b / a;

		for (i = 1; i < n; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Double.parseDouble(tempVar5);
			}
			if (b / a - c > 0.05)
			{
				System.out.print("better\n");
			}
			else if (c - b / a > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


	public static String[] mn = {"5\n" "125 99\n" "112 89\n" "145 99\n" "99 97\n" "123 98", "7\n" "100 20\n" "100 24\n" "100 16\n" "100 23\n" "100 19\n" "100 28\n" "100 10", "13\n" "97 15\n" "97 20\n" "97 18\n" "97 26\n" "97 7\n" "97 18\n" "97 29\n" "97 14\n" "97 3\n" "97 12\n" "97 1\n" "97 9\n" "100 15"};

	public static int xn = 0;

//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: int max_files = sizeof(mn) / sizeof(mn[0]);
	public static int max_files = mn.length;

	public static String output_dir = "data";

	public static void xbuild()
	{
		System.out.print(mn[xn]);
		xn++;
	}

}

