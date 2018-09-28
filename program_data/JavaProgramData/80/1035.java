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
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int k = 0;
		int n;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		if (y2 == y1)
		{
			if (y1 % 400 == 0 || y1 % 4 == 0 && y1 % 100 != 0)
			{
				if (m1 == m2)
				{
					System.out.printf("%d",d2 - d1);
				}
				else
				{
					if (m1 <= 2)
					{
						for (i = m1;i < m2;i++)
						{
							k += a[i - 1];
						}
						System.out.printf("%d\n",k + d2 + 1 - d1);
					}
					else
					{
						for (i = m1;i < m2;i++)
						{
							k += a[i - 1];
						}
						System.out.printf("%d\n",k + d2 + 1 - d1);
					}
				}
			}
			else
			{
				if (m1 == m2)
				{
					System.out.printf("%d\n",d2 - d1);
				}
				else
				{
					for (i = m1;i < m2;i++)
					{
						k += b[i - 1];
					}
					System.out.printf("%d\n",k + d2 + 1 - d1);
				}
			}
		}
		else
		{
			if ((y2 - y1) == 1)
			{
				if (y1 % 400 == 0 || y1 % 4 == 0 && y1 % 100 != 0)
				{
					if (m1 <= 2)
					{
						for (j = m1;j <= 12;j++)
						{
							k += a[j - 1];
						}
						for (j = 1;j < m2;j++)
						{
							k += b[j - 1];
						}
						System.out.printf("%d\n",k + d2 + 1 - d1);
					}
				}
				else if (y2 % 400 == 0 || y2 % 4 == 0 && y2 % 100 != 0)
				{
					if (m2 < 2)
					{
						for (i = m1;i <= 12;i++)
						{
							k += b[i - 1];
						}
						System.out.printf("%d\n",k + d2 + 1 - d1);
					}
					else
					{
						for (i = m1;i <= 12;i++)
						{
							k += b[i - 1];
						}
						for (i = 1;i < m2;i++)
						{
							k += a[i - 1];
						}
						System.out.printf("%d\n",k + d2 + 1 - d1);
					}
				}
			}
			else
			{
				for (i = y1 + 1;i < y2;i++)
				{
					if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0)
					{
						k += 366;
					}
					else
					{
						k += 365;
					}
				}
				if (y1 % 400 == 0 || y1 % 4 == 0 && y1 % 100 != 0)
				{
					if (y2 % 400 == 0 || y2 % 4 == 0 && y2 % 100 != 0)
					{
						for (j = m1;j <= 12;j++)
						{
							k += a[j - 1];
						}
						for (j = 1;j < m2;j++)
						{
							k += a[j - 1];
						}
						System.out.printf("%d\n",k + d2 - d1);
					}
					else
					{
						for (j = m1;j <= 12;j++)
						{
							k += b[j - 1];
						}
						for (j = 1;j < m2;j++)
						{
							k += b[j - 1];
						}
						System.out.printf("%d\n",k + d2 - d1);
					}
				}
				else
				{
					if (y2 % 400 == 0 || y2 % 4 == 0 && y2 % 100 != 0)
					{
						for (j = m1;j <= 12;j++)
						{
							k += b[j - 1];
						}
						for (j = 1;j < m2;j++)
						{
							k += a[j - 1];
						}
						System.out.printf("%d\n",k + d2 - d1);
					}
					else
					{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


