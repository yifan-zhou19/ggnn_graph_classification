package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???1000012846_2.cpp  *****************************
	//*  ??:??  ******************************************
	//*  ?????2010?12?  *******************************
	//*  ???????????????  *********************
	//********************************************************
	public static int Main()
	{
		int n;
		int p;
		int q;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			int total = 0;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < p;j++)
			{
				for (k = 0;k < q;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int h = 0;h < q;h++)
			{
				total += *(a + h);
				total += *(*(a + p - 1) + h);
			}
			for (int g = 0;g < p;g++)
			{
				total += **(a + g);
				total += *(*(a + g) + q - 1);
			}
			total -= * a;
			total -= *(a + q - 1);
			total -= **(a + p - 1);
			total -= *(*(a + p - 1) + q - 1);
			System.out.print(total);
			System.out.print("\n");
		}
			return 0;
	}

}

