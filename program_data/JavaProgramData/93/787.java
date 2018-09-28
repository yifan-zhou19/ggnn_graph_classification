package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 105 == 0)
		{
					System.out.print("3 5 7");
		}
		else if ((a % 15 == 0) && (a % 7 != 0))
		{
								System.out.print("3 5");
		}
		else if ((a % 21 == 0) && (a % 5 != 0))
		{
			 System.out.print("3 7");
		}
		else if ((a % 35 == 0) && (a % 3 != 0))
		{
			 System.out.print("5 7");
		}
		else if ((a % 3 == 0) && (a % 35 != 0))
		{
			 System.out.print("3");
		}
		else if ((a % 5 == 0) && (a % 21 != 0))
		{
			 System.out.print("5");
		}
		else if ((a % 7 == 0) && (a % 15 != 0))
		{
			 System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while ((c = System.in.read()) != '\n' && c != EOF)
		{
			;
		}
		clearerr(stdin);
		System.in.read();
		return 0;
	}

}

