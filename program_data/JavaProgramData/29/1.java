package <missing>;

public class GlobalMembers
{
	///#define main xmain


	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		double n1;
		double n2;
		double t;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0; j < m; j++)
		{
			sum = 0;
			n1 = 1;
			n2 = 2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				sum += n2 / n1;
				t = n1;
				n1 = n2;
				n2 = t + n2;
			}
			System.out.printf("%.3lf\n", sum);
		}
		return 0;
	}


	public static String[] mn = {"3\n" "5\n" "10\n" "20", "7\n" "13\n" "12\n" "11\n" "4\n" "5\n" "6\n" "7", "21\n" "1\n" "2\n" "3\n" "4\n" "5\n" "6\n" "7\n" "8\n" "9\n" "10\n" "11\n" "12\n" "13\n" "14\n" "15\n" "16\n" "17\n" "18\n" "19\n" "20\n" "11"};

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

