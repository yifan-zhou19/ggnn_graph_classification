//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int leapyear(int n)
	{
		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int lf(int m1,int m2)
	{
		int max = m1;
		int min = m2;
		int k = 0;
		if (m1 < m2)
		{
			max = m2;
			min = m1;
		}
		switch (max)
		{
				  case 12:
					  k += 30;
				  case 11:
					  if (min == 11)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 10:
					  if (min == 10)
					  {
						  break;
					  }
					  else
					  {
						  k += 30;
					  }
				  case 9:
					  if (min == 9)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 8:
					  if (min == 8)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 7:
					  if (min == 7)
					  {
						  break;
					  }
					  else
					  {
						  k += 30;
					  }
				  case 6:
					  if (min == 6)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 5:
					  if (min == 5)
					  {
						  break;
					  }
					  else
					  {
						  k += 30;
					  }
				  case 4:
					  if (min == 4)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 3:
					  if (min == 3)
					  {
						  break;
					  }
					  else
					  {
						  k += 29;
					  }
				  case 2:
					  if (min == 2)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 1:
					  break;
		}
		if (k % 7 == 0)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int nf(int m1,int m2)
	{
		int max = m1;
		int min = m2;
		int k = 0;
		if (m1 < m2)
		{
			max = m2;
			min = m1;
		}
		switch (max)
		{
				  case 12:
					  k += 30;
				  case 11:
					  if (min == 11)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 10:
					  if (min == 10)
					  {
						  break;
					  }
					  else
					  {
						  k += 30;
					  }
				  case 9:
					  if (min == 9)
					  {
						  break;
					  }
					  else
					  {
						  k += 31;
					  }
				  case 8:
					  if (min == 8)
					  {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


