package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b = 0;
	   int c = 0;

	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   b = a % 10;
	   a = a / 10;
	   for (;b != 0;)
	   {
		   c = c * 10 + b;
		   b = a % 10;
		   a = a / 10;

	   }
	   System.out.print(c);
		return 0;
	}

}

