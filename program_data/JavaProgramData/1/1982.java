package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 30fenjie.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================

	public static int factorize(int a, int b)
	{
	  int factor;
	  int i;
	  if (a == 1)
	  {
		  factor = 1;
	  }
	  if (a != 1)
	  {
		  factor = 0;
	  }
	  for (i = b;i <= a;i++)
	  {
		  if (a % i == 0)
		  {
			  factor = factor + factorize(a / i, i);
		  }
	  }
	  return factor;
	}
	public static int Main()
	{
		int n;
		int a;
		for ((n; n--; cout << factorize(a, 2) << "\n" = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
}

