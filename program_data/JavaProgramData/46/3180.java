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
		int[] b = new int[10000];
		int i;
		int j;
		int r;
		int c;
		int k = 0;
		int row;
		int col;
		int p;
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
		r = row;
		c = col;
		if (r >= c)
		{
		for (c = col;c > col / 2;c--)
		{
			p = 0;
			for (j = col - c;j < c;j++)
			{
				b[k] = a[row - r][j];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			for (j = row - r + 1;j < r;j++)
			{
				b[k] = a[j][c - 1];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			for (j = c - 2;j >= col - c;j--)
			{
				b[k] = a[r - 1][j];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			for (j = r - 2;j > row - r;j--)
			{
				b[k] = a[j][col - c];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			r--;
		}
		}
		if (r < c)
		{
		for (r = row;r > row / 2;r--)
		{
			p = 0;
			for (j = col - c;j < c;j++)
			{
				b[k] = a[row - r][j];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			for (j = row - r + 1;j < r;j++)
			{
				b[k] = a[j][c - 1];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			for (j = c - 2;j >= col - c;j--)
			{
				b[k] = a[r - 1][j];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			for (j = r - 2;j > row - r;j--)
			{
				b[k] = a[j][col - c];
				k++;
				p++;
			}
			if (p == 0)
			{
				break;
			}
			else
			{
				p = 0;
			}
			c--;
		}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < k;i++)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


