package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       
	//*?????? 1100012789      
	//*???2011.11.14                       
	//****************************************

	public static int DoOneStep(int n)
	{
		if (n % 2 == 0) // ?????
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
		return (n / 2);
		}
		else // ?????
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
		return (n * 3 + 1);
		}
	}
	public static int Main()
	{
		int n; // result??????
		int result;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result = n; // ???n
		for (; result > 1;) // ????1??????
		{
			result = DoOneStep(result);
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}

