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
	  int year1;
	  int month1;
	  int day1;
	  int q;
	  int sum1;
	  int R1;
	  int year2;
	  int month2;
	  int day2;
	  int sum2;
	  int R2;
	  int i;
	  int j;
	  int k;
	  int sum;
	  int sum3 = 0;
	  sum1 = 0;
	  R1 = 0;
	  sum2 = 0;
	  R2 = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  year1 = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  month1 = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  day1 = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  year2 = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  month2 = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  day2 = Integer.parseInt(tempVar6);
	  }

	  /*????*/
	  if (year1 % 100 == 0)
	  {
		 if (year1 % 400 == 0)
		 {
			 R1 = 1;
		 }
		 else
		 {
			 R1 = 0;
		 }
	  }
	  else
	  {
		 if (year1 % 4 == 0)
		 {
			 R1 = 1;
		 }
		 else
		 {
			 R1 = 0;
		 }
	  }




	/*??????????????*/
	  if (month1 == 1)
	  {
		  sum1 = day1;
	//	  printf("%d\n",sum1);
	  }
	  else
	  {
		if (month1 == 2)
		{
			sum1 = 31 + day1;
	//		printf("%d\n",sum1);
		}
		else
		{
		  if (R1 == 0) //???
		  {
			if (month1 == 3)
			{
				sum1 = 31 + 28 + day1;
			}
			if (month1 == 4)
			{
				sum1 = 31 + 28 + 31 + day1;
			}
			if (month1 == 5)
			{
				sum1 = 31 + 28 + 31 + 30 + day1;
			}
			if (month1 == 6)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + day1;
			}
			if (month1 == 7)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + 30 + day1;
			}
			if (month1 == 8)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day1;
			}
			if (month1 == 9)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day1;
			}
			if (month1 == 10)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day1;
			}
			if (month1 == 11)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day1;
			}
			if (month1 == 12)
			{
				sum1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day1;
			}
	//		printf("%d\n",sum1);
		  }

		  if (R1 == 1)
		  {
			  if (month1 == 3)
			  {
				  sum1 = 31 + 29 + day1;
			  }
			if (month1 == 4)
			{
				sum1 = 31 + 29 + 31 + day1;
			}
			if (month1 == 5)
			{
				sum1 = 31 + 29 + 31 + 30 + day1;
			}
			if (month1 == 6)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + day1;
			}
			if (month1 == 7)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + 30 + day1;
			}
			if (month1 == 8)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day1;
			}
			if (month1 == 9)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day1;
			}
			if (month1 == 10)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day1;
			}
			if (month1 == 11)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day1;
			}
			if (month1 == 12)
			{
				sum1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day1;
			}
	//		printf("%d\n",sum1);
		  }

		}
	  }





	  /*????*/
	  if (year2 % 100 == 0)
	  {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


