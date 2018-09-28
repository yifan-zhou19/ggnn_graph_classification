package <missing>;

public class GlobalMembers
{
	//*****************************************************************
	//* file 3.cpp                                                    *
	//* name ??                                                     *
	//* date 2012-9-29                                                *
	//* description ??3 5 7????                                 *
	//*****************************************************************
	public static int Main() // ???
	{ // ?????
		int m; // ??????m
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((m % 3 == 0) && (m % 5 == 0) && (m % 7 == 0))
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else
		{
			if (m % 3 == 0) // ?????1???m??3?????
			{
			  if (m % 5 == 0)
			  {
				  System.out.print("3 5");
				  System.out.print("\n");
			  }
			  else
			  {
				  if (m % 7 == 0)
				  {
					  System.out.print("3 7");
					  System.out.print("\n");
				  }
				  else
				  {
					  System.out.print("3");
					  System.out.print("\n");
				  }
			  }
			}
			else
			{
				if (m % 5 == 0) // ?????2???m??5??????
				{
				   if (m % 7 == 0)
				   {
					   System.out.print("5 7");
					   System.out.print("\n");
				   }
				   else
				   {
					   System.out.print("5");
					   System.out.print("\n");
				   }
				}
			else
			{
				if (m % 7 == 0)
				{
					System.out.print("7");
					System.out.print("\n");
				}
			else
			{
				System.out.print("n");
				System.out.print("\n");
			}
			}
			}
		}
			return 0;
	} // ?????



}

