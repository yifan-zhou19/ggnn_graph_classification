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
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int[] temp = {1, 0, 1, 0};
		int flag = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		temp[1] = row - 2;
		temp[3] = col - 2;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}


		if (row != 1 && col != 1)
		{



		i = 0;
		j = 0;
		p(a[0][0]);
		while ((temp[0] - temp[1]) * (int)Math.pow(-1,flag) < 0 && (temp[2] - temp[3]) * (int)Math.pow(-1,flag) < 0)
		{

			if (col <= 3)
			{
				break;
			}

			for (j = temp[2];(j - temp[3]) * (int)Math.pow(-1,flag) <= 0;j += (int)Math.pow(-1,flag))
			{
				p(a[i][j]);
			}
			p(a[i][j]);

			for (i = temp[0];(i - temp[1]) * (int)Math.pow(-1,flag) <= 0;i += (int)Math.pow(-1,flag))
			{
				p(a[i][j]);
			}
			p(a[i][j]);

			t = temp[0];
			temp[0] = temp[1];
			temp[1] = t;
			t = temp[2];
			temp[2] = temp[3];
			temp[3] = t;
			flag++;

			for (j = temp[2];(j - temp[3]) * (int)Math.pow(-1,flag) <= 0;j += (int)Math.pow(-1,flag))
			{
				p(a[i][j]);
			}
			p(a[i][j]);

			for (i = temp[0];(i - temp[1]) * (int)Math.pow(-1,flag) <= 0;i += (int)Math.pow(-1,flag))
			{
				p(a[i][j]);
			}
			p(a[i + 1][j + 1]);


			t = temp[0];
			temp[0] = temp[1];
			temp[1] = t;
			t = temp[2];
			temp[2] = temp[3];
			temp[3] = t;

			temp[0]++;
			temp[2]++;
			temp[1]--;
			temp[3]--;
			i++;

			flag++;
		}

		if (col == 3)
		{
			j--;
		}
		if (temp[0] == temp[1])
		{
			i = i + 1;
			for (j = temp[2];j <= temp[3];j++)
			{
				p(a[i - 1][j]);
			}
			j--;
			p(a[i - 1][j + 1]);
			p(a[i][j + 1]);
			p(a[i + 1][j + 1]);
			for (j = temp[3];j >= temp[2];j--)
			{
				p(a[i + 1][j]);
			}
			j++;
			p(a[i + 1][j - 1]);
			p(a[i][j - 1]);
			for (j = temp[2];j <= temp[3];j++)
			{
				p(a[i][j]);
			}
		}

		else if (temp[2] == temp[3])
		{
			j = j + 2;
			p(a[temp[0] - 1][j]);
			p(a[temp[0] - 1][j + 1]);
			for (i = temp[0];i <= temp[1] + 1;i++)
			{
				p(a[i][j + 1]);
			}
			i--;
			p(a[i][j]);
			for (i = temp[1] + 1;i >= temp[0];i--)
			{
				p(a[i][j - 1]);
			}
			i++;
			for (i = temp[0];i <= temp[1];i++)
			{
				p(a[i][j]);
			}
		}

		else if (Math.abs(temp[2] - temp[3]) == 1 && Math.abs(temp[0] - temp[1]) != 1)
		{
			for (j = temp[2] + 1;j <= temp[3];j++)
			{
				p(a[i][j]);
			}
			i++;
			for (j = temp[3];j >= temp[2];j--)
			{
				p(a[i][j]);
			}
		}

		else
		{
			p(a[i][j + 2]);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


