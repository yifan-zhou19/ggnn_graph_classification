package <missing>;

public class GlobalMembers
{
	//************************
	// * 5.cpp
	// *  ??3?5?7????
	// *  Created on: 2012-9-30
	// *  Author: ??  1200012934
	// ************************
	public static int Main() //???
	{
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0) //?n??3????
		{
				if (n % 5 == 0)
				{
					if (n % 7 == 0)
					{
					System.out.print("3 5 7");
					}
				 else
				 {
					System.out.print("3 5");
				 }
				}
			 else //??n??3??????5??
			 {
					if (n % 7 == 0)
					{
					System.out.print("3 7");
					}
				 else
				 {
					System.out.print("3");
				 }
			 }
		}
		else //?n???3????
		{
				if (n % 5 == 0)
				{
					if (n % 7 == 0)
					{
					System.out.print("5 7");
					}
				 else //??n???7??
				 {
					System.out.print("5");
				 }
				}
			 else //??n???5??
			 {
					if (n % 7 == 0)
					{
					System.out.print("7");
					}
				 else //??n???7??
				 {
					System.out.print("n");
				 }
			 }
		}
		return 0;
	} //?????

}

