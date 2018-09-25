package <missing>;

public class GlobalMembers
{
	//**************************
	//*?????3?5?7????**
	//*?????? 1200012888 **
	//*???2012.09.25**
	//**************************
	public static int Main()
	{
		int N; //????N
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N % 3 == 0 && N % 5 == 0 && N % 7 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		//????3?5?7???????3 5 7???????????
		else if (N % 3 != 0 && N % 5 == 0 && N % 7 == 0)
		{
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (N % 3 == 0 && N % 5 != 0 && N % 7 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (N % 3 == 0 && N % 5 == 0 && N % 7 != 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print("\n");
		}
		//?????????????????????????????3 5?? 3 7??5 7,????????
		else if (N % 3 == 0 && N % 5 != 0 && N % 7 != 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (N % 3 != 0 && N % 5 == 0 && N % 7 != 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (N % 3 != 0 && N % 5 != 0 && N % 7 == 0)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		//?????????????????
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		//????????????????n)
		return 0;
	}
}

