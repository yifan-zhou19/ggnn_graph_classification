package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????
	 * ?????2011?11?6?
	 * ??????
	 * ???????????????
	 */
	public static int Main() //?????
	{
		int sum; //sum?????
	   int num100 = 0; //???????????
	   int num50 = 0;
	   int num20 = 0;
	   int num10 = 0;
	   int num5 = 0;
	   int num1 = 0;
	   sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int yu100 = sum % 100;
	   num100 = (sum - yu100) / 100; //???????????
	   int yu10 = yu100 % 10;
	   int shiwei = yu100 - yu10; //?????
	   if (shiwei >= 50)
	   {
		   num50 = 1;
		   int yu20 = shiwei - 50;
		   if (yu20 % 20 == 0)
		   {
			   num20 = yu20 / 20;
		   }
		   else
		   {
			   num20 = (yu20 - 10) / 20;
		   }
		   num10 = (yu20 - 20 * num20) / 10;
	   }
	   else
	   {
		   num50 = 0; //??50??????
		   if (shiwei % 20 == 0)
		   {
			   num20 = shiwei / 20;
		   num10 = 0;
		   }
		   else
		   {
			   num20 = (shiwei - 10) / 20;
		   num10 = (shiwei - 20 * num20) / 10; //??20?10??????
		   }
	   }
	   int gewei; //??5??1??????
	   gewei = sum % 10;
	   if (gewei == 0)
	   {
		   num5 = 0;
		   num1 = 0;
	   }
	   else if (gewei < 5 && gewei>0)
	   {
		   num5 = 0;
		   num1 = gewei;
	   }
	   else if (gewei >= 5 && gewei <= 9)
	   {
		   num5 = 1;
		   num1 = gewei % 5;
	   }

	   System.out.print(num100);
	   System.out.print("\n");
	   System.out.print(num50);
	   System.out.print("\n");
	   System.out.print(num20);
	   System.out.print("\n");
	   System.out.print(num10);
	   System.out.print("\n");
	   System.out.print(num5);
	   System.out.print("\n");
	   System.out.print(num1);
	   System.out.print("\n");



		return 0;
	} //?????
}

