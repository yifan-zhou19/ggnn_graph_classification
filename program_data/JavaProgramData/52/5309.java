package <missing>;

public class GlobalMembers
{
	/*
	 * Pointer1.9MovePointer.cpp
	 * ????
	 *  Created on: 2012-12-21
	 *      Author: ???
	 *      ???????n????????????????m????????m????????m??(m<n)?
	 *
	 */
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * s;
		for (int i = 0;i < n;i++) //?????????????cin>>???
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		s = a + n - m;
		while (s < a + n)
		{ //???m???
			System.out.print(s);
			System.out.print(" ");
			s++;
		}
		s = a;
		while (s < a + n - m - 1)
		{ //???n-m-1???
			System.out.print(s);
			System.out.print(" ");
			s++;
		}
		System.out.print((a + n - m - 1));
		System.out.print("\n");
		return 0;
	}

}

