package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int n = 0;
		int a;
		int b;
		int c;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = num % 3; //a??3??????
		b = num % 5; //b??5??????
		c = num % 7; //C??7??????
		if (a == 0 && b == 0 && c == 0) //???????????
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		if (a == 0 && b == 0 && c != 0) //??7??
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		if (a == 0 && c == 0 && b != 0) //??5??
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		if (b == 0 && c == 0 && a != 0) //??3??
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		if (a == 0 && b != 0 && c != 0) //??5?7??
		{
			System.out.print("3");
			System.out.print("\n");
		}
		if (a != 0 && b == 0 && c != 0) //??3?7??
		{
			System.out.print("5");
			System.out.print("\n");
		}
		if (a != 0 && b != 0 && c == 0) //??3?5??
		{
			System.out.print("7");
			System.out.print("\n");
		}
		if (a != 0 && b != 0 && c != 0) //??????
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}


}

