package <missing>;

public class GlobalMembers
{
	/**
	* @file 1.cpp
	* @author ???
	* @date 2011-11?06
	* @description
	* ??????:????
	*/
	// ??????ji???
	public static int ji(int m)
	{
		System.out.print(m);
		System.out.print('*');
		System.out.print(3);
		System.out.print('+');
		System.out.print(1);
		m = m * 3 + 1;
		System.out.print('=');
		System.out.print(m);
		System.out.print("\n");
		return m; // ?m???n
	}
	// ??????ou???
	public static int ou(int m)
	{
		System.out.print(m);
		System.out.print('/');
		System.out.print(2);
		m = m / 2;
		System.out.print('=');
		System.out.print(m);
		System.out.print("\n");
		return m;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			if ((n % 2) == 1)
			{
				n = ji(n); // ????????ji
			}
			else
			{
				n = ou(n); // ?????ou
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

