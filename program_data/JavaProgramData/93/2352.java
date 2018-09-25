package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (num % 3 == 0) //????num?3,5,7??????????????????????????????????????????
		{
			System.out.print('3');
		   if (num % 5 == 0)
		   {
			   System.out.print(" 5");
		   }
		   if (num % 7 == 0)
		   {
			   System.out.print(" 7");
		   }
		}
		else if (num % 5 == 0)
		{
			System.out.print('5');
			 if (num % 7 == 0)
			 {
				 System.out.print(" 7");
			 }
		}
		else if (num % 7 == 0)
		{
			System.out.print("7");
		}

		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print('n');
		}

		return 0;

	}

}

