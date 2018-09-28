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
		int n;
		int s100;
		int s50;
		int s20;
		int s10;
		int s5;
		int s1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s100 = n / 100;
		int m = n - s100 * 100;
		if (m >= 90)
		{
		s50 = 1;
		s20 = 2;
		s10 = 0;
		if (m - 90 >= 5)
		{
		s5 = 1;
		s1 = m - 95;
		}
		else if (m - 90 < 5)
		{
		s5 = 0;
		s1 = m - 90;
		}
		}
		if (m < 90 && m >= 80)
		{
		s50 = 1;
		s20 = 1;
		s10 = 1;
		if (m >= 85)
		{
		s5 = 1;
		s1 = m - 85;
		}
		else if (m < 85)
		{
		s5 = 0;
		s1 = m - 80;
		}
		}
		if (m < 80 && m >= 70)
		{
		s50 = 1;
		s20 = 1;
		s10 = 0;
		if (m >= 75)
		{
		s5 = 1;
		s1 = m - 75;
		}
		if (m < 75)
		{
		s5 = 0;
		s1 = m - 70;
		}
		}
		if (m < 70 && m >= 60)
		{
		s50 = 1;
		s20 = 0;
		s10 = 1;
		if (m >= 65)
		{
		s5 = 1;
		s1 = m - 65;
		}
		if (m < 65)
		{
		s5 = 0;
		s1 = m - 60;
		}
		}
		 if (m < 60 && m >= 50)
		 {
		s50 = 1;
		s20 = 0;
		s10 = 0;
		if (m >= 55)
		{
		s5 = 1;
		s1 = m - 55;
		}
		if (m < 55)
		{
		s5 = 0;
		s1 = m - 50;
		}
		 }
		 if (m < 50 && m >= 40)
		 {
		s50 = 0;
		s20 = 2;
		s10 = 0;
		if (m >= 45)
		{
		s5 = 1;
		s1 = m - 45;
		}
		if (m < 65)
		{
		s5 = 0;
		s1 = m - 40;
		}
		 }
		  if (m < 40 && m >= 30)
		  {
		s50 = 0;
		s20 = 1;
		s10 = 1;
		if (m >= 35)
		{
		s5 = 1;
		s1 = m - 35;
		}
		if (m < 35)
		{
		s5 = 0;
		s1 = m - 30;
		}
		  }
		if (m < 30 && m >= 20)
		{
		s50 = 0;
		s20 = 1;
		s10 = 0;
		if (m >= 25)
		{
		s5 = 1;
		s1 = m - 25;
		}
		if (m < 25)
		{
		s5 = 0;
		s1 = m - 20;
		}
		}
		if (m < 20 && m >= 10)
		{
		s50 = 0;
		s20 = 0;
		s10 = 1;
		if (m >= 15)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


