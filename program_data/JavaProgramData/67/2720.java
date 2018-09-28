package <missing>;

public class GlobalMembers
{
	//*************************
	//**7.cpp??????****
	//**??????1300012993*
	//**???2013.10.1**
	//*************************
	public static int Main()
	{
		int n;
		double x;
		double y;
		double a;
		double b;
		double num;
		double num1;
		double eff;
		double eff1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		eff1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		x = eff1 / num1; //??????????
		while ((num = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (eff = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0) //??
		{
			  y = eff / num; //?????????
			a = x - y;
			b = y - x; //?????
			if (a > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			  else
			  {
				if (b > 0.05) //??????????????0.05????better
				{
				  System.out.print("better");
				  System.out.print("\n");
				}
				else
				{
				  System.out.print("same");
				  System.out.print("\n");
				}
			  }
		} //????same
		return 0;
	}

}

