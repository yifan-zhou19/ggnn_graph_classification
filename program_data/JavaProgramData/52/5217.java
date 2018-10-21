package <missing>;

public class GlobalMembers
{
	/*
	 *???round.cpp
	 *???????
	 *??: 2012-12-12
	 *?????1200012825
	 */

	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		int[] a = new int[300];
		for (p = a;p < a + n;p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a;p < a + n - m;p++)
		{
			*(p + n) = *p;
		}
		for (p = a;p < a + n;p++)
		{
			*p = (p + n - m); //????
		}
		System.out.print(a);
		for (p = a + 1;p < a + n;p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}

}

