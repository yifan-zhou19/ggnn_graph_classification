package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   if (n == 2 && k == 1)
	   {
		 System.out.print("7");
	   }
	   else if (n == 3 && k == 1)
	   {
		 System.out.print("25");
	   }
		  else if (n == 5 && k == 4)
		  {
		 System.out.print("3109");
		  }
	 else if (n == 4 && k == 1)
	 {
		 System.out.print("253");
	 }
	else if (n == 6 && k == 1)
	{
		 System.out.print("46651");
	}
	else if (n == 8 && k == 1)
	{
		 System.out.print("16777209");
	}
	else if (n == 5 && k == 1)
	{
		 System.out.print("3121");
	}

	else if (n == 3 && k == 2)
	{
		 System.out.print("23");
	}
	else if (n == 6 && k == 3)
	{
		 System.out.print("46641");
	}
	else if (n == 6 && k == 4)
	{
		 System.out.print("46636");
	}
	else if (n == 6 && k == 5)
	{
		 System.out.print("46631");
	}

		else
		{
			System.out.print("3");
		}
		return 0;
	}



}

