package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.cpp   **
	//*???????    **
	//*?????? 1300012838 **
	//*???2013.12.11  **
	//********************************

	public static int[] num = new int[110];

	public static void movenum(int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = num + n;
		while (p > num)
		{
			*p = (p - 1);
			p--;
		}
		num[0] = (p + n);
	}

	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1; i <= m; i++)
		{
			movenum(n);
		}
		System.out.print(num[0]);
		for (int i = 1; i < n; i++)
		{
			System.out.print(" ");
			System.out.print(num[i]);
		}
		System.out.print("\n");

		return 0;
	}

}

