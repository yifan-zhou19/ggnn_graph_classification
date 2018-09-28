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
		int m = 0;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		int[][] c = new int[10][10];
		int[][] d = new int[10][10];
		int[][] e = new int[10][10];
		a[5][5] = m;
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (a[i][j] != 0)
				{
				b[i][j] = 2 * a[i][j] + b[i][j];
							   b[i + 1][j] = a[i][j] + b[i + 1][j];
							   b[i - 1][j] = a[i][j] + b[i - 1][j];
							   b[i + 1][j + 1] = a[i][j] + b[i + 1][j + 1];
							   b[i - 1][j + 1] = a[i][j] + b[i - 1][j + 1];
							   b[i][j + 1] = a[i][j] + b[i][j + 1];
							   b[i + 1][j - 1] = a[i][j] + b[i + 1][j - 1];
							   b[i - 1][j - 1] = a[i][j] + b[i - 1][j - 1];
							   b[i][j - 1] = a[i][j] + b[i][j - 1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (b[i][j] != 0)
				{
				c[i][j] = 2 * b[i][j] + c[i][j];
							   c[i + 1][j] = b[i][j] + c[i + 1][j];
							   c[i - 1][j] = b[i][j] + c[i - 1][j];
							   c[i + 1][j + 1] = b[i][j] + c[i + 1][j + 1];
							   c[i - 1][j + 1] = b[i][j] + c[i - 1][j + 1];
							   c[i][j + 1] = b[i][j] + c[i][j + 1];
							   c[i + 1][j - 1] = b[i][j] + c[i + 1][j - 1];
							   c[i - 1][j - 1] = b[i][j] + c[i - 1][j - 1];
							   c[i][j - 1] = b[i][j] + c[i][j - 1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (c[i][j] != 0)
				{
				d[i][j] = 2 * c[i][j] + d[i][j];
							   d[i + 1][j] = c[i][j] + d[i + 1][j];
							   d[i - 1][j] = c[i][j] + d[i - 1][j];
							   d[i + 1][j + 1] = c[i][j] + d[i + 1][j + 1];
							   d[i - 1][j + 1] = c[i][j] + d[i - 1][j + 1];
							   d[i][j + 1] = c[i][j] + d[i][j + 1];
							   d[i + 1][j - 1] = c[i][j] + d[i + 1][j - 1];
							   d[i - 1][j - 1] = c[i][j] + d[i - 1][j - 1];
							   d[i][j - 1] = c[i][j] + d[i][j - 1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (d[i][j] != 0)
				{
				e[i][j] = 2 * d[i][j] + e[i][j];
							   e[i + 1][j] = d[i][j] + e[i + 1][j];
							   e[i - 1][j] = d[i][j] + e[i - 1][j];
							   e[i + 1][j + 1] = d[i][j] + e[i + 1][j + 1];
							   e[i - 1][j + 1] = d[i][j] + e[i - 1][j + 1];
							   e[i][j + 1] = d[i][j] + e[i][j + 1];
							   e[i + 1][j - 1] = d[i][j] + e[i + 1][j - 1];
							   e[i - 1][j - 1] = d[i][j] + e[i - 1][j - 1];
							   e[i][j - 1] = d[i][j] + e[i][j - 1];
				}
			}
		}
		if (n == 1)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				if (j != 9)
				{
					System.out.print(b[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(b[i][j]);
					System.out.print("\n");
				}
				}
			}
		}
		if (n == 2)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				if (j != 9)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
				}
			}
		}
		if (n == 3)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				if (j != 9)
				{
					System.out.print(d[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(d[i][j]);
					System.out.print("\n");
				}
				}
			}
		}
		if (n == 4)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				if (j != 9)
				{
					System.out.print(e[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(e[i][j]);
					System.out.print("\n");
				}
				}
			}
		}





		System.in.read();

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


