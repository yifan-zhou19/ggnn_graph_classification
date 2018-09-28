//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class mem
{
	public int year;
	public int month1;
	public int month2;
}

package <missing>;

public class GlobalMembers
{
	public static mem[] mem = tangible.Arrays.initializeWithDefaultmemInstances(205);
	public static int find(int n)
	{
		int flag = 0;
		if (n % 4 == 0)
		{
			if (n % 100 == 0)
			{
				if (n % 400 == 0)
				{
					flag = 1;
				}
				else
				{
					flag = 0;
				}
			}
			else
			{
				flag = 1;
			}
		}
		return flag;
	}
	public static int spp1(int n)
	{
		int p = 0;
		if (n == 1)
		{
			p = 31;
		}
		if (n == 2)
		{
			p = 28;
		}
		if (n == 3)
		{
			p = 31;
		}
		if (n == 4)
		{
			p = 30;
		}
		if (n == 5)
		{
			p = 31;
		}
		if (n == 6)
		{
			p = 30;
		}
		if (n == 7)
		{
			p = 31;
		}
		if (n == 8)
		{
			p = 31;
		}
		if (n == 9)
		{
			p = 30;
		}
		if (n == 10)
		{
			p = 31;
		}
		if (n == 11)
		{
			p = 30;
		}
		if (n == 12)
		{
			p = 31;
		}
		return p;
	}
	public static int spp2(int n)
	{
		int p = 0;
		if (n == 1)
		{
			p = 31;
		}
		if (n == 2)
		{
			p = 29;
		}
		if (n == 3)
		{
			p = 31;
		}
		if (n == 4)
		{
			p = 30;
		}
		if (n == 5)
		{
			p = 31;
		}
		if (n == 6)
		{
			p = 30;
		}
		if (n == 7)
		{
			p = 31;
		}
		if (n == 8)
		{
			p = 31;
		}
		if (n == 9)
		{
			p = 30;
		}
		if (n == 10)
		{
			p = 31;
		}
		if (n == 11)
		{
			p = 30;
		}
		if (n == 12)
		{
			p = 31;
		}
		return p;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				mem[i].year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mem[i].month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				mem[i].month2 = Integer.parseInt(tempVar4);
			}
			if (find(mem[i].year) == 0) //???????
			{
				int p = 0;
				if (mem[i].month1 > mem[i].month2)
				{
					for (j = mem[i].month2;j < mem[i].month1;j++)
					{
						p += spp1(j);
					}
				}
	/*
	            else if(mem[i].month1==mem[i].month2)
	            {
	                printf("YES\n");
	            }
	*/
				else
				{
					for (j = mem[i].month1;j < mem[i].month2;j++)
					{
						p += spp1(j);
					}
				}
				if (p % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


