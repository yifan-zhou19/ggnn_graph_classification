package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shj.cpp
	// Author      : ???
	// Time        : 2013.12.13
	// Description : ????
	//============================================================================
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int[] p = new int[100];
		for (i = 0;i < n;i++)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		System.out.print((p + n - 1));
	   if (n > 1)
	   {
		   for (i = n - 2;i >= 0;i--)
		   {
			  System.out.print(" ");
			  System.out.print((p + i));
		   }
	   }
		System.out.print("\n");
		return 0;
	}

}

