package <missing>;

public class GlobalMembers
{
	/**
	 *@file     5.cpp
	 *@author   ??? 
	 *@date     2012-09-29
	 *@description 
	 *          ?3,5,7???? 
	 */
	public static int Main()
	{
		int n; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0) //?????3??
		{
		   if (n % 5 == 0) //???????5??
		   {
			 if (n % 7 == 0) //???????7??
			 {
				System.out.print("3 5 7");
			 }
			 else
			 {
				System.out.print("3 5");
			 }
		   }
		   else //???5??
		   {
			  if (n % 7 == 0) //???5?????7??
			  {
				 System.out.print("3 7");
			  }
			  else
			  {
				 System.out.print("3");
			  }
		   }
		}
		else
		{
			if (n % 5 == 0) //??3?????5??
			{
				if (n % 7 == 0) //????5,7??
				{
					System.out.print("5 7");
				}
				else //???7??
				{
					System.out.print("5");
				}
			}
			else //???3,5??
			{
				if (n % 7 == 0) //??7??
				{
				System.out.print("7");
				}
				else //???3,5,7??
				{
					if (n % 3 && n % 5 && n % 7)
					{
						System.out.print("n");
					}
				}
			}
		}
		return (0);
	}
}

