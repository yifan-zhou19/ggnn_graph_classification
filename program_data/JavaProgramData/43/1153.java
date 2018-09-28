package <missing>;

public class GlobalMembers
{
	//************************************
	//*??????  1300012809         **
	//*???2013.10.24                 **
	//*???????????           **
	//************************************
	public static int Main()
	{
		int m;
		int i;
		int a;
		int b;
		int c;
		int j;
		int d;
		int f;
		int k;
		int panduan;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = m / 2;
		for (a = 3;a <= c;a = a + 2) //?????????3??????+2
		{
			b = m - a; //???3?m????????????????
			d = Math.sqrt(b);
			panduan = 0;
			for (j = 2;j <= d;j++) //??????????
			{
				if (b % j == 0)
				{
					panduan = 1;
				}
			}
			f = Math.sqrt(a);
			for (k = 2;k <= f;k++) //???????????
			{
				if (a % k == 0)
				{
					panduan = 1;
				}
			}
			if (panduan == 0)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}

		}
	   return 0;
	}
}

