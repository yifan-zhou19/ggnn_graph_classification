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
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int p;
		int m;
		int n;
		int s = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		m = a[0][0];
		k = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[0][j] > m)
			{
				m = a[0][j];
				k = j;
			}
			else
			{
				;
			}
		}
		n = a[0][k];
		p = 0;
		for (i = 0;i < 5;i++)
		{
			if (a[i][k] < n)
			{
				n = a[i][k];
				p = i;
			}
			else
			{
				;
			}
		}
		if (p == 0)
		{
			System.out.printf("1 %d %d",k + 1,a[0][k]);
		}
		else
		{
			s++;
		}

		m = a[1][0];
		k = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[1][j] > m)
			{
				m = a[1][j];
				k = j;
			}
			else
			{
				;
			}
		}
		n = a[0][k];
		p = 0;
		for (i = 0;i < 5;i++)
		{
			if (a[i][k] < n)
			{
				n = a[i][k];
				p = i;
			}
			else
			{
				;
			}
		}
		if (p == 1)
		{
			System.out.printf("2 %d %d",k + 1,a[1][k]);
		}
		else
		{
			s++;
		}

		m = a[2][0];
		k = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[2][j] > m)
			{
				m = a[2][j];
				k = j;
			}
			else
			{
				;
			}
		}
		n = a[0][k];
		p = 0;
		for (i = 0;i < 5;i++)
		{
			if (a[i][k] < n)
			{
				n = a[i][k];
				p = i;
			}
			else
			{
				;
			}
		}
		if (p == 2)
		{
			System.out.printf("3 %d %d",k + 1,a[2][k]);
		}
		else
		{
			s++;
		}

		m = a[3][0];
		k = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[3][j] > m)
			{
				m = a[3][j];
				k = j;
			}
			else
			{
				;
			}
		}
		n = a[0][k];
		p = 0;
		for (i = 0;i < 5;i++)
		{
			if (a[i][k] < n)
			{
				n = a[i][k];
				p = i;
			}
			else
			{
				;
			}
		}
		if (p == 3)
		{
			System.out.printf("4 %d %d",k + 1,a[3][k]);
		}
		else
		{
			s++;
		}

		m = a[4][0];
		k = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[4][j] > m)
			{
				m = a[4][j];
				k = j;
			}
			else
			{
				;
			}
		}
		n = a[0][k];
		p = 0;
		for (i = 0;i < 5;i++)
		{
			if (a[i][k] < n)
			{
				n = a[i][k];

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


