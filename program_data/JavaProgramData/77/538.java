package <missing>;

public class GlobalMembers
{
	public static int counter = 0;
	public static void match()
	{
		char temp;
		temp = System.in.read();
		int num1 = counter++;
		while (cin.peek() == temp)
		{
			match();
		}
		System.in.read();
		System.out.print(num1);
		System.out.print(' ');
		System.out.print(counter++);
		System.out.print("\n");
	}


	public static int Main()
	{
		match();
		return 0;
	}

}
