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
		int[][] number = new int[5][5];
		int i = 0;
		int j = 0;
		int[] y = new int[5];
		int p = 0;
		while (i < 5)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				number[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				number[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				number[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				number[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				number[i][4] = Integer.parseInt(tempVar5);
			}

			i++;
		}
		i = 0;
		j = 0;
		int[] hang = new int[5];
		int[] lie = new int[5];
		int[] x = new int[5];
		while (i < 5)
		{
			x[i] = number[i][0];
			while (j < 5)
			{
				if (number[i][j] >= x[i])
				{
					hang[i] = i;
					lie[i] = j;
					x[i] = number[i][j];
				}
				j++;
			}
			i++;
			j = 0;
		}
		i = 0;
		j = 0;

		j = lie[0];
		y[j] = number[0][j];
			while (i < 5)
			{
				if (number[i][j] < y[j])
				{
					   y[j] = number[i][j];
				}
				   i++;
			}
			if (x[0] == y[j])
			{
				System.out.printf("%d %d %d", (hang[0] + 1),(lie[0] + 1),x[0]);
			}
			else
			{
				p++;
			}


		i = 0;
		j = 0;
		j = lie[1];
		y[j] = number[1][j];
			while (i < 5)
			{
				if (number[i][j] < y[j])
				{
					   y[j] = number[i][j];
				}
				   i++;
			}
			if (x[1] == y[j])
			{
				System.out.printf("%d %d %d", (hang[1] + 1),(lie[1] + 1),x[1]);
			}
			else
			{
				p++;
			}

	   i = 0;
	   j = 0;
	   j = lie[2];
		y[j] = number[2][j];
			while (i < 5)
			{
				if (number[i][j] < y[j])
				{
					   y[j] = number[i][j];
				}
				   i++;
			}
			if (x[2] == y[j])
			{
				System.out.printf("%d %d %d", (hang[2] + 1),(lie[2] + 1),x[2]);
			}
			else
			{
				p++;
			}

	   i = 0;
	   j = 0;
	   j = lie[3];
		y[j] = number[3][j];
			while (i < 5)
			{
				if (number[i][j] < y[j])
				{
					   y[j] = number[i][j];
				}
				   i++;
			}
			if (x[3] == y[j])
			{
				System.out.printf("%d %d %d", (hang[3] + 1),(lie[3] + 1),x[3]);
			}
			else
			{
				p++;
			}

	   i = 0;
	   j = 0;
	   j = lie[4];
		y[j] = number[4][j];
			while (i < 5)
			{
				if (number[i][j] < y[j])
				{
					   y[j] = number[i][j];
				}
				   i++;
			}
			if (x[4] == y[j])
			{
				System.out.printf("%d %d %d", (hang[4] + 1),(lie[4] + 1),x[4]);
			}
			else
			{
				p++;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


