package <missing>;

public class GlobalMembers
{
	//***************************************
	//       ????????               *
	//       ??????                   *
	//       ?????2012.10              *
	//       ????????               *
	//***************************************
	public static int Main() //?????
	{
		int m; //?????????m?????n?????i,j
		int n;
		int i = 1;
		int j = 1;
		double x; //?????????x,a,b?????s?
		double s;
		double a = 1;
		double b = 2;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= m;j++) //????
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (a = 1,b = 2,i = 1,s = 0;i <= n;i++) //???????
			{
				if (i % 2 == 1)
				{
					x = b / a;
					s = s + x;
					a = a + b;
				}
				else
				{
					x = a / b;
					s = s + x;
					b = b + a;
				}
			}
			System.out.printf("%.3f\n",s); //????
		}

		return 0;
	}
}

