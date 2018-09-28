package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 9.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double[] x = new double[100];
		for (int i = 0;i < n;i++) //??
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x[i] = b / a;
		}
		for (int i = 1;i < n;i++) //??
		{
			if (x[i] - x[0] > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (x[0] - x[i] > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

