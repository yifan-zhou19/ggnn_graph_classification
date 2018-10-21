//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[6];
		int[] p = new int[6];
		int[] day0 = new int[81];
		int[] day1 = new int[81];
		int[] day2 = new int[81];
		int[] day3 = new int[81];
		int[] day4 = new int[81];
		int[] day5 = new int[81];
		p[0] = day0;
		p[1] = day1;
		p[2] = day2;
		p[3] = day3;
		p[4] = day4;
		p[5] = day5;
		int m; //m??????????? n???????
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		int i; //??????
		int j;
		int k;
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j < 81;j++)
			{
							 p[i][j] = 0;
			}

			//??????????????
		}
		p[0][40] = m; //??????????????
		int add; //??
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 81;i++)
			{
				add = p[k][i];
				if (i == 0 || i == 8 || i == 72 || i == 80) //???????????????3???????
				{
					 if (i == 0)
					 {
						 p[k + 1][0] += 2 * add;
						 p[k + 1][1] += add;
						 p[k + 1][9] += add;
						 p[k + 1][10] += add;
					 }
					 if (i == 8)
					 {
						 p[k + 1][8] += 2 * add;
						 p[k + 1][7] += add;
						 p[k + 1][16] += add;
						 p[k + 1][17] += add;
					 }
					 if (i == 72)
					 {
						 p[k + 1][72] += 2 * add;
						 p[k + 1][63] += add;
						 p[k + 1][64] += add;
						 p[k + 1][73] += add;
					 }
					 if (i == 80)
					 {
						 p[k + 1][80] += 2 * add;
						 p[k + 1][70] += add;
						 p[k + 1][71] += add;
						 p[k + 1][79] += add;
					 }

				}
				if (i % 9 == 0 && i != 0 && i != 72)
				{
					p[k + 1][i] += 2 * add;
					p[k + 1][i - 9] += add;
					p[k + 1][i - 8] += add;
					p[k + 1][i + 1] += add;
					p[k + 1][i + 9] += add;
					p[k + 1][i + 10] += add;
				}
				else if ((i + 1) % 9 == 0)
				{
					p[k + 1][i] += 2 * add;
					p[k + 1][i - 9] += add;
					p[k + 1][i - 10] += add;
					p[k + 1][i - 1] += add;
					p[k + 1][i + 8] += add;
					p[k + 1][i + 9] += add;
				}
				else if (i > 0 && i < 8)
				{
					p[k + 1][i] += 2 * add;
					p[k + 1][i - 1] += add;
					p[k + 1][i + 1] += add;
					p[k + 1][i + 8] += add;
					p[k + 1][i + 9] += add;
					p[k + 1][i + 10] += add;
				}
				else if (i > 72 && i < 80)
				{
					p[k + 1][i] += 2 * add;
					p[k + 1][i - 1] += add;
					p[k + 1][i + 1] += add;
					p[k + 1][i - 8] += add;
					p[k + 1][i - 9] += add;
					p[k + 1][i - 10] += add;
				}
				else
				{
					p[k + 1][i] += 2 * add;
					p[k + 1][i - 1] += add;
					p[k + 1][i + 1] += add;
					p[k + 1][i - 8] += add;
					p[k + 1][i - 9] += add;
					p[k + 1][i - 10] += add;
					p[k + 1][i + 8] += add;
					p[k + 1][i + 9] += add;
					p[k + 1][i + 10] += add;
				}

			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				System.out.printf("%d",p[n][i * 9 + j]);
				if (j < 8)
				{
					System.out.print(" ");
				}
				else
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


