package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.cpp   **
	//*?????? 1200012768 **
	//*???2012.11.  **
	//*???????  **
	//********************************
	public static int num(int n)
	{
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			return n / 2;
		}
		else
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
			return n * 3 + 1;
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			n = num(n);
		}
		System.out.print("End\n");
		return 0;
	}
}

