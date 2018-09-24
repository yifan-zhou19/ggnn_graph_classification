package <missing>;

public class GlobalMembers
{
	public static void fuction(int num)
	{
		 System.out.print(num % 10);
		 if ((num / 10) != 0)
		 {
		 fuction(num / 10);
		 }
	}
	public static int Main()
	{
		int a;
		int i;
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		for (i = i;;i++)
		{
					 if (a % 10 == 0)
					 {
					 a = a / 10;
					 }
					 else
					 {
					 break;
					 }
		}
		if (a > 0)
		{
			fuction(a);
			System.out.print("\n");
		}
		if (a == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (a < 0)
		{
		 a = -a;
		 System.out.print("-");
		 fuction(a);
		 System.out.print("\n");
		}
		}
		return 0;

	}

}

