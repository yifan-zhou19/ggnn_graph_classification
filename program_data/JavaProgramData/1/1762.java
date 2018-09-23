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


	public static int sum = 0; //????sum

	public static void devide(int a,int b) //??
	{
		if (a == 1)
		{
			sum++;
		}
		else
		{
			if (a >= b)
			{
				devide(a, b + 1);
			}
			if (a % b == 0)
			{
				devide(a / b, b);
			}
		}
	}

	public static int Main() //???
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			devide(a, 2);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

