package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shuzunixu.cpp
	// Author      :
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		int middle = 0;
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;


		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (p = a;p < a + n;p++)
			{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

		for (p = a,q = a + n - 1;p < q;p++,q--)
		{
			middle = p;
		  *p = q;
		  *q = middle;

		}
		for (p = a;p < a + n;p++)
		{
				if (p < a + n - 1)
				{
					System.out.print(p);
					System.out.print(' ');
				}
			else
			{
				System.out.print(p);
			}

		}

		return 0;
	}

}

